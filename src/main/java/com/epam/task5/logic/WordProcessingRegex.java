package com.epam.task5.logic;

import java.util.List;

public class WordProcessingRegex implements WordProcessing{
    @Override
    public List<String> transformText(List<String> sourceText, int position, char letter) {
        for(int i = 0; i < sourceText.size(); i++)
            if(sourceText.get(i).matches("letter")){

            }
        return null;
    }
}
