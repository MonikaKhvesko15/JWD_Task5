package com.epam.task5.view;

public class PrintResultFactory implements PrintFactory {
    @Override
    public Printer createPrinter(OutputType outputType) {
        switch (outputType) {
            case CONSOLE:
                return new ConsolePrintText();
            case FILE:
                return new FilePrintText();
            default:
                throw new IllegalArgumentException("unknown output type: " + outputType);
        }
    }
}
