package com.epam.task5.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirerTest {
    private final static String FILE_NAME = "src/test/resources/inputTest.txt";
    public static final String INVALID_FILE = "invalid.txt";

    @Test
    public void testShouldGetTextFromFileWhenFileExists() throws DataException {
        //given
        FileDataAcquirer acquirer = new FileDataAcquirer();
        List<String> excepted=new ArrayList<>();
        excepted.add("Hello world!");
        //when
        List<String> actual = acquirer.getText(FILE_NAME);
        //then
        Assert.assertEquals(excepted,actual);
    }

    @Test(expected = DataException.class)//then
    public void testShouldGetTextThrowExceptionWhenFileNotExists() throws DataException {
        //given
        FileDataAcquirer acquirer = new FileDataAcquirer();
        //when
        List<String> text=acquirer.getText(INVALID_FILE);
    }
}
