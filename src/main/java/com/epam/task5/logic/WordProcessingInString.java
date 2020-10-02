package com.epam.task5.logic;

import java.util.ArrayList;
import java.util.List;

public class WordProcessingInString implements WordProcessing{

    public List<String> transformText(List<String> sourceText, int position, char letter) {
        TransformListTextToStringArray transform = new TransformListTextToStringArray();
        String[] text = transform.GetStringArray(sourceText);

        List<String> textResult = new ArrayList<>();
        CheckLetterPosition checking = new CheckLetterPosition();

        for (int i = 0; i < text.length; i++) {
            if (checking.checkPosition(text[i], position)) {
                text[i].replace(text[i].charAt(position), letter);
            }
            textResult.add(text[i]);
        }

        return textResult;
    }
}
