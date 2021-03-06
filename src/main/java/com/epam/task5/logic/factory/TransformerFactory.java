package com.epam.task5.logic.factory;

import com.epam.task5.logic.WordProcessing;
import com.epam.task5.logic.WordProcessingRegex;
import com.epam.task5.logic.WordProcessingInString;

public class TransformerFactory implements Transform {
    @Override
    public WordProcessing createTransformer(TransformType type) {
        switch(type){
            case STRING:
                return new WordProcessingInString();
            case REGEX:
                return new WordProcessingRegex();
            default:
                throw new IllegalArgumentException("Incorrect type!");
        }
    }

}
