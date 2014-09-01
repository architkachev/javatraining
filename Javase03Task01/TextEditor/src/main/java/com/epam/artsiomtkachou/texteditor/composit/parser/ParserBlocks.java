package com.epam.artsiomtkachou.texteditor.composit.parser;

import com.epam.artsiomtkachou.texteditor.composit.Component;
import com.epam.artsiomtkachou.texteditor.composit.Composite;
import com.epam.artsiomtkachou.texteditor.composit.Leaf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserBlocks implements Parser {
    String regexToParseBlocks;
    Parser parserSentences;

    public ParserBlocks() throws IOException {
        this.regexToParseBlocks = Component.bundle.getString("regexp.key1");
        parserSentences = new ParserSentences();
    }


    @Override
    public ArrayList<Component> getArrayListComponents(String inputText) throws IOException {
        ArrayList<Component> componentArrayList = new ArrayList<Component>();
        Pattern pattern = Pattern.compile(this.regexToParseBlocks);
        Matcher matcher = pattern.matcher(inputText);

        ArrayList<String> allblockText = new ArrayList<String>();
        for (String blockText: pattern.split(inputText)){
            allblockText.add(blockText);
        }

        ArrayList<String> allblockCode = new ArrayList<String>();
        while (matcher.find()){
            allblockCode.add(matcher.group());
        }

        int lengthCode = allblockCode.size();
        int lengthText = allblockText.size();
        int j = 0;
        while (j<(lengthText>=lengthCode?lengthText:lengthCode)){
            if(j < lengthText) {
                Composite composite = new Composite();
                composite.setComponentArrayList(parserSentences.getArrayListComponents(allblockText.get(j)));
                composite.setTypeOfComponent(Component.BLOCK_TEXT);
                componentArrayList.add(composite);
            }
            if (j < lengthCode) {
                Leaf leaf = new Leaf(allblockCode.get(j));
                leaf.setTypeOfComponent(Component.BLOCK_CODE);
                componentArrayList.add(leaf);
            }
            j++;
        }

        return componentArrayList;
    }
}
