package com.epam.task5.data;

import java.io.IOException;
import java.util.List;

public interface DataAcquirer {
    List<String> getText(String filename) throws DataException, IOException;
}
