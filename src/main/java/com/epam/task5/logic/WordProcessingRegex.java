package com.epam.task5.logic;

import java.util.ArrayList;
import java.util.List;

public class WordProcessingRegex implements WordProcessing {
    public List<String> transformText(List<String> sourceText, int position, char letter) {

        TransformListTextToStringArray transform = new TransformListTextToStringArray();
        String[] text = transform.GetStringArray(sourceText);
        List<String> textResult = new ArrayList<>();
        CheckLetterPosition checking = new CheckLetterPosition();

        for (int i = 0; i < text.length; i++) {
            if (checking.checkPosition(text[i], position)) {

                textResult.add(text[i].replaceAll(String.format("(\\b\\p{L}{%d})\\p{L}", position - 1), "$1" + letter));
            } else {
                textResult.add(text[i]);
            }
        }

        return textResult;
    }

}

