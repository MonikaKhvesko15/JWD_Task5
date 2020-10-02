package com.epam.task5.data;

public interface AcquirerFactory {
    DataAcquirer createAcquirer(InputType inputType);
}
