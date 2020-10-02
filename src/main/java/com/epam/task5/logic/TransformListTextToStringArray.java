package com.epam.task5.logic;

import java.util.List;

public class TransformListTextToStringArray {
    public String[] GetStringArray(List<String> sourceText) {
        String[] text = new String[sourceText.size()];
        // ArrayList to Array Conversion
        for (int j = 0; j < sourceText.size(); j++) {
            // Assign each value to String array
            text[j] = sourceText.get(j);
        }
        return text;
    }
}
