package com.epam.task5.data;

public class DataAcquirerFactory implements AcquirerFactory {
    @Override
    public DataAcquirer createAcquirer(InputType inputType) {
        switch (inputType) {
            case FILE:
                return new FileDataAcquirer();
            case CONSOLE:
                return new ConsoleDataAcquirer();
            default:
                throw new IllegalArgumentException("unknown input type: " + inputType);
        }
    }
}
