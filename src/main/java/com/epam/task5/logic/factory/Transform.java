package com.epam.task5.logic.factory;

import com.epam.task5.logic.WordProcessing;

public interface Transform {
    WordProcessing createTransformer();
}
