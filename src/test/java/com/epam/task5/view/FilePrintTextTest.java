package com.epam.task5.view;

import com.epam.task5.data.DataException;
import com.epam.task5.data.FileDataAcquirer;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilePrintTextTest {

    public static final String OUTPUT_TEST_TXT = "src/test/resources/outputTest.txt";
    public static final String INVALID_TXT = "invalid.txt";

    @Test
    public void testShouldPrintTextToFileWhenFileExists() throws DataException, IOException {
        //given
        FilePrintText printer = new FilePrintText();
        List<String> excepted=new ArrayList<>();
        excepted.add("Hello world!");
        //when
        printer.print(excepted, OUTPUT_TEST_TXT);
    }

    @Test//then
    public void testShouldPrintTextThrowExceptionWhenFileNotExists() throws  IOException {
        //given
        FilePrintText printer = new FilePrintText();
        List<String> excepted=new ArrayList<>();
        excepted.add("Hello world!");
        //when
       printer.print(excepted, INVALID_TXT);
    }
}
