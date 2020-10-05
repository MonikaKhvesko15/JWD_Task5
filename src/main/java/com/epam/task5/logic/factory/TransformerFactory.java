package com.epam.task5.logic.factory;

import com.epam.task5.logic.WordProcessing;
import com.epam.task5.logic.WordProcessingInString;

public class TransformerFactory implements Transform {
    @Override
    public WordProcessing createTransformer() {
        return new WordProcessingInString();
    }
}
