package com.epam.artsiomtkachou.texteditor.composit.comparator;

import com.epam.artsiomtkachou.texteditor.composit.Component;
import com.epam.artsiomtkachou.texteditor.manager.BookManager;

import java.util.Comparator;

public class ComparatorByNumberOfIncludes implements Comparator<String> {
    Component component;

    public ComparatorByNumberOfIncludes(Component component) {
        this.component = component;
    }

    @Override
    public int compare(String o1, String o2) {
        int range1 = BookManager.quantityIncludesOfWordInComponent(component,o1);
        int range2 = BookManager.quantityIncludesOfWordInComponent(component,o2);

        if (range1>range2){
            return -1;
        } else if (range1==range2){
            return 0;
        } else {
            return 1;
        }
    }
}




