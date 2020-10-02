package com.epam.task5.data;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleDataAcquirer implements DataAcquirer {
    @Override
    public List<String> getText() throws DataException, IOException {
        System.out.print("Enter text >> ");

        String text;
        List<String> lines = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();

        while (reader.ready()) {
            text = reader.readLine();
            lines.add(text);
        }

        return lines;
    }
}
