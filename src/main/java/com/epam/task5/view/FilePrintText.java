package com.epam.task5.view;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FilePrintText implements Printer {

    public static final String FILE_OUTPUT_TXT = "output.txt";

    @Override
    public void print(List<String> text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_OUTPUT_TXT));
        writer.write(String.valueOf(text));

        writer.close();
    }
}
