package com.epam.task5.data;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileDataAcquirer implements DataAcquirer {

    public static final String FILE_INPUT_TXT = "C:\\Users\\HP\\Documents\\JWD_Task5\\input.txt";

    public List<String> getText() throws DataException {
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get(FILE_INPUT_TXT), StandardCharsets.UTF_8);
        } catch (IOException | NumberFormatException e) {
            throw new DataException(e.getMessage(), e);
        }
        return lines;
    }
}
