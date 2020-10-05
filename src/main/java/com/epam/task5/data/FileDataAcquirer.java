package com.epam.task5.data;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileDataAcquirer implements DataAcquirer {

    public List<String> getText(String filename) throws DataException {
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }
        return lines;
    }
}
