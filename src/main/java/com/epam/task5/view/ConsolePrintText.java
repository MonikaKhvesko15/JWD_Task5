package com.epam.task5.view;

import java.io.IOException;
import java.util.List;

public class ConsolePrintText implements Printer {
    @Override
    public void print(List<String> text) throws IOException {
        System.out.print(text);
    }
}
