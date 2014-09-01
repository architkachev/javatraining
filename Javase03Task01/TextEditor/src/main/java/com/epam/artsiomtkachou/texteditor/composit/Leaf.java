package com.epam.artsiomtkachou.texteditor.composit;

import com.epam.artsiomtkachou.texteditor.composit.iterator.NullIterator;
import com.epam.artsiomtkachou.texteditor.composit.parser.ParserSubsentences;
import java.util.Iterator;

public class Leaf extends Component {
    private String value;

    public Leaf(String value) {
        this.value = value;
    }

    @Override
    public String getStringComponent() {
        return this.value;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    public static int detectTypeOfSubsentence(String subsentence){

        int result = 0;
        if (subsentence.matches(ParserSubsentences.regexToParseWhitespaces)){
            result = result|WHITESPACE;
        }
        if (subsentence.matches(ParserSubsentences.regexToParsePunctuationSigns)){
            result = result|PUNCTUATION_SIGN;
        }
        if (subsentence.matches(ParserSubsentences.regexToParseWords)){
            result = result|WORD;
        }
        if (subsentence.matches(ParserSubsentences.regexToParseNumbers)){
            result = result|NUMBER;
        }
        return result;
    }
}
