package com.epam.task5.logic;

import java.util.List;

public interface WordProcessing {
    public List<String> transformText(List<String> sourceText, int position, char letter);
}
