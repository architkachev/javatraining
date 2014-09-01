package com.epam.artsiomtkachou.texteditor.composit.parser;

import com.epam.artsiomtkachou.texteditor.composit.Component;
import com.epam.artsiomtkachou.texteditor.composit.Leaf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserSubsentences implements Parser {
    public static String regexToParseSubsentences;
    public static String regexToParseWords;
    public static String regexToParseNumbers;
    public static String regexToParsePunctuationSigns;
    public static String regexToParseWhitespaces;

    public ParserSubsentences() throws IOException {
        regexToParseSubsentences =  Component.bundle.getString("regexp.key3");
        String[] miniparcers = regexToParseSubsentences.split(Component.bundle.getString("regexp.key4"));
        if (miniparcers.length==5){
            regexToParseWords = miniparcers[1];
            regexToParsePunctuationSigns = miniparcers[3];
            regexToParseWhitespaces = miniparcers[2];
            regexToParseNumbers = miniparcers[4];
        } else{
            regexToParseWords = "[A-Za-z\\'-]+";
            regexToParsePunctuationSigns = "[\\p{Punct}^\\'^-]";
            regexToParseWhitespaces = "\\s";
            regexToParseNumbers = "[\\d]+";
        }
    }

    public static String getRegexToParseWords() {
        return regexToParseWords;
    }

    public static String getRegexToParseNumbers() {
        return regexToParseNumbers;
    }

    public static String getRegexToParsePunctuationSigns() {
        return regexToParsePunctuationSigns;
    }

    public static String getRegexToParseWhitespaces() {
        return regexToParseWhitespaces;
    }




    @Override
    public ArrayList<Component> getArrayListComponents(String inputText) throws IOException {
        ArrayList<Component> leafArrayList = new ArrayList<Component>();
        Pattern pattern = Pattern.compile(regexToParseSubsentences);
        Matcher matcher = pattern.matcher(inputText);

        ArrayList<String> allSubsentences = new ArrayList<String>();
        while (matcher.find()){
            allSubsentences.add(matcher.group());
        }


        for (String stringSubsentence: allSubsentences){
            Leaf leaf = new Leaf(stringSubsentence);
            leaf.setTypeOfComponent(Leaf.detectTypeOfSubsentence(stringSubsentence));
            leafArrayList.add(leaf);
         }
        return leafArrayList;
    }
}
