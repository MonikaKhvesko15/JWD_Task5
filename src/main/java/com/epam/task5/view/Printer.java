package com.epam.task5.view;

import java.io.IOException;
import java.util.List;

public interface Printer {
    void print(List<String> text,String filename) throws IOException;
}
