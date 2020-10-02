package com.epam.task5.logic;

public class TransformerFactory implements Transform {
    @Override
    public WordProcessing createTransformer(TransformType transformType) {
        switch (transformType) {
            case REGEX:
                return new WordProcessingRegex();
            case STRING:
                return new WordProcessingInString();
            default:
                throw new IllegalArgumentException("unknown type: " + transformType);
        }
    }
}
