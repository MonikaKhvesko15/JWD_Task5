package com.epam.task5.data;

public class DataAcquirerFactory implements AcquirerFactory {
    @Override
    public DataAcquirer createAcquirer() {
        return new FileDataAcquirer();
    }
}
