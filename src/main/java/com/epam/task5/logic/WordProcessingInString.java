package com.epam.task5.logic;

import java.util.ArrayList;
import java.util.List;

public class WordProcessingInString implements WordProcessing {

    @Override
    public List<String> transformText(List<String> sourceText, int position, char letter) {
        TransformListTextToStringArray transform = new TransformListTextToStringArray();
        String[] text = transform.GetStringArray(sourceText);
        List<String> textResult = new ArrayList<>();
        CheckLetterPosition checking = new CheckLetterPosition();

        for (int i = 0; i < text.length; i++) {

            if (checking.checkPosition(text[i], position)) {
                text[i] = text[i].replace(text[i].charAt(position - 1), letter);
                textResult.add(text[i]);
            }
            textResult.add(text[i]);
        }
        return textResult;
    }

}
