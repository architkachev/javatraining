package com.epam.artsiomtkachou.texteditor;

import com.epam.artsiomtkachou.texteditor.composit.Component;
import com.epam.artsiomtkachou.texteditor.manager.BookManager;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BookManager bookManager = new BookManager("text.txt");

        System.out.println(getStringBook(bookManager));

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("is");
        arrayList.add("the");
        arrayList.add("if");


        for(String string: bookManager.getListComponentsSortedByNumberIncludes(arrayList)){
            System.out.println(string);
            System.out.println(BookManager.quantityIncludesOfWordInComponent(bookManager.getBook(),string));
        }

/*
        System.out.println(getStringBook(bookManager));
        for (Component component: bookManager.getArrayListComponents(Component.WORD)){
            System.out.println(BookManager.quantityIncludesOfWordInComponent(component, "is")+ " --- " + component.getStringComponent());
        }
*/

/*
        int i =1;
        for (Component component: bookManager.getArrayListComponents(Component.WORD | Component.PUNCTUATION_SIGN)){
            System.out.println(i++ +"\t" + component.getStringComponent());
        }

        int j =1;
        for (Component component: bookManager.getArrayListComponents(Component.WORD | Component.PUNCTUATION_SIGN)){
            System.out.println(j++ +"\t" + component.getStringComponent());
        }*/
/*
        StringBuffer stringBuffer = new StringBuffer();
        for (Component component: bookManager.getArrayListComponents(Component.WORD)){
            stringBuffer.append(component.getStringComponent());
        }
        System.out.println(stringBuffer);

        //bookManager.changePlacesOfFirstAndLastWordsInEachSentence();
        System.out.println("--------------------------------------");
*/
/*
        StringBuffer stringBuffer2 = new StringBuffer();
        for (Component component: bookManager.getArrayListLeafs()){
            stringBuffer2.append(component.getStringComponent());
        }

        System.out.println(stringBuffer2);
*/
/*

        for (Component component: bookManager.getArrayListLeafs()){
            System.out.print(component.getStringComponent());
        }*/
    }


    public static String getStringBook(BookManager bookManager){
        StringBuffer stringBuffer = new StringBuffer();
        for (Component component: bookManager.getArrayListLeafs()){
            stringBuffer.append(component.getStringComponent());
        }
        return stringBuffer.toString();
    }
}
