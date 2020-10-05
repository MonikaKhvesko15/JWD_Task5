package com.epam.task5.view;

public class PrintResultFactory implements PrintFactory {
    @Override
    public Printer createPrinter() {
        return new FilePrintText();

    }
}
