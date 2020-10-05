package com.epam.task5.view;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FilePrintText implements Printer {

    @Override
    public void print(List<String> text,String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(String.valueOf(text));

        writer.close();
    }
}
