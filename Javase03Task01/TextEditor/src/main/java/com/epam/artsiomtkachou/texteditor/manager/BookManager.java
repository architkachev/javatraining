package com.epam.artsiomtkachou.texteditor.manager;

import com.epam.artsiomtkachou.texteditor.composit.Component;
import com.epam.artsiomtkachou.texteditor.composit.Composite;
import com.epam.artsiomtkachou.texteditor.composit.comparator.ComparatorByNumberOfIncludes;
import com.epam.artsiomtkachou.texteditor.composit.parser.Parser;
import com.epam.artsiomtkachou.texteditor.composit.parser.ParserBlocks;
import com.epam.artsiomtkachou.texteditor.util.TxtFileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BookManager {
    private Component book;

    public Component getBook() {
        return book;
    }

    public BookManager(String pathToFile) throws IOException {
        String inputText = TxtFileReader.readFileToString(pathToFile);
        Composite composite = new Composite();
        Parser parser = new ParserBlocks();
        composite.setComponentArrayList(parser.getArrayListComponents(inputText));
        this.book = composite;
    }

    public ArrayList<Component> getArrayListComponents(int typeOfComponent){
        ArrayList<Component> arrayList = new ArrayList<Component>();
        Iterator bookIterator = this.book.createIterator();
        while (bookIterator.hasNext()) {
            Component component = (Component) bookIterator.next();
            if ((component.getTypeOfComponent() & typeOfComponent) == component.getTypeOfComponent()) {
                arrayList.add(component);
            }
        }
        return arrayList;
    }

    public static ArrayList<Component> getArrayListComponents(int typeOfComponent, Component inputComponent){
        ArrayList<Component> arrayList = new ArrayList<Component>();
        Iterator iterator = inputComponent.createIterator();
        while (iterator.hasNext()){
            Component component =(Component) iterator.next();
            if ((component.getTypeOfComponent()&typeOfComponent)==component.getTypeOfComponent()){
                arrayList.add(component);
            }
        }
        return arrayList;
    }

    public ArrayList<Component> getArrayListLeafs(){
        int typeOfComponent = 124; // ( BLOCK_CODE | WORD | NUMBER | PUNCTUATION | SIGNWHITESPACE ) == 124
        return this.getArrayListComponents(typeOfComponent);
    }

    //Task 5
    public void changeFirstAndLastWordsInEachSentence(){
        for ( Component sentenceComponent : getArrayListComponents(Component.SENTENCE)){
            ArrayList<Component> fullSentence = ((Composite) sentenceComponent).getComponentArrayList();
            ArrayList<Component> onlyWords = BookManager.getArrayListComponents(Component.WORD, sentenceComponent);
            if(!onlyWords.isEmpty()){
                Component firstWord = onlyWords.get(0);
                Component lastWord = onlyWords.get(onlyWords.size() - 1);
                int indexOfFirstWord = fullSentence.indexOf(firstWord);
                int indexOfLastWord = fullSentence.indexOf(lastWord);
                Collections.swap(fullSentence,indexOfFirstWord,indexOfLastWord);
            }
        }
    }

    //Task 10
    public static int quantityIncludesOfWordInComponent(Component component, String word){
        int result = 0;
        for(Component wordComponent: getArrayListComponents(Component.WORD,component)) {
            if (wordComponent.getStringComponent().equals(word)) {
                result++;
            }
        }
        return result;
    }

    public ArrayList<String> getListComponentsSortedByNumberIncludes(ArrayList<String> words){
        words.sort(new ComparatorByNumberOfIncludes(this.book));
        return words;
    }


}
