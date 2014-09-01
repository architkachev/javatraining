package com.epam.artsiomtkachou.texteditor.util;

import java.io.*;

public class TxtFileReader {

    public static String readFileToString(String fileName) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String s;
        while((s=bufferedReader.readLine())!=null){
            stringBuilder.append(s);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
