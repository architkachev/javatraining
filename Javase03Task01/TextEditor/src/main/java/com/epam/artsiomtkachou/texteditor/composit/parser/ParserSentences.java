package com.epam.artsiomtkachou.texteditor.composit.parser;

import com.epam.artsiomtkachou.texteditor.composit.Component;
import com.epam.artsiomtkachou.texteditor.composit.Composite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserSentences implements Parser {
    String regexToParseSentences;
    Parser parserSubsentences;

    public ParserSentences() throws IOException {
        this.regexToParseSentences = Component.bundle.getString("regexp.key2");
        parserSubsentences = new ParserSubsentences();
    }
    @Override
    public ArrayList<Component> getArrayListComponents(String inputText) throws IOException {
        ArrayList<Component> compositeArrayList = new ArrayList<Component>();
        Pattern pattern = Pattern.compile(this.regexToParseSentences);
        Matcher matcher = pattern.matcher(inputText);

        ArrayList<String> allSentences = new ArrayList<String>();
        while (matcher.find()){
            allSentences.add(matcher.group());
        }

        for (String stringSentence: allSentences){
            Composite composite = new Composite();
            composite.setComponentArrayList(parserSubsentences.getArrayListComponents(stringSentence));
            composite.setTypeOfComponent(Component.SENTENCE);
            compositeArrayList.add(composite);
        }

        return compositeArrayList;
    }
}
