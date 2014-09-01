package com.epam.artsiomtkachou.texteditor.composit.parser;

import com.epam.artsiomtkachou.texteditor.composit.Component;

import java.io.IOException;
import java.util.ArrayList;

public interface Parser {
    ArrayList<Component> getArrayListComponents(String inputText) throws IOException;
}
