package com.epam.artsiomtkachou.texteditor.composit;

import java.util.Iterator;
import java.util.ResourceBundle;

public abstract class Component implements Cloneable {
    private int typeOfComponent;
    public static ResourceBundle bundle = ResourceBundle.getBundle("regexp");
    public int getTypeOfComponent() {
        return typeOfComponent;
    }

    public void setTypeOfComponent(int typeOfComponent) {
        this.typeOfComponent = typeOfComponent;
    }

    public static final int BLOCK_TEXT = 1;
    public static final int SENTENCE = 2;
    public static final int BLOCK_CODE = 4;
    public static final int WORD = 8;
    public static final int NUMBER = 16;
    public static final int PUNCTUATION_SIGN = 32;
    public static final int WHITESPACE = 64;

    public abstract String getStringComponent();

    public abstract Iterator createIterator();
}
