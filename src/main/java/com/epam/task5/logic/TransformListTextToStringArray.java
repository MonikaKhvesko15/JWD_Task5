package com.epam.task5.logic;

import java.util.List;

public class TransformListTextToStringArray {
    public String[] GetStringArray(List<String> sourceText) {
        //conversion of ArrayList to String
        StringBuilder strbul = new StringBuilder();
        for (String str : sourceText) {
            strbul.append(str);
            strbul.append(",");
        }

        //just for removing last comma
        String str = strbul.toString();
        String[] words = str.split("\\s");

        return words;
    }
}
