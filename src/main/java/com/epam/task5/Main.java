package com.epam.task5;

import com.epam.task5.data.*;
import com.epam.task5.logic.*;
import com.epam.task5.logic.factory.Transform;
import com.epam.task5.logic.factory.TransformerFactory;
import com.epam.task5.view.PrintFactory;
import com.epam.task5.view.PrintResultFactory;
import com.epam.task5.view.Printer;

import java.io.IOException;
import java.util.List;

public class Main {
    public static final String FILE_INPUT_TXT = "input.txt";
    public static final String FILE_OUTPUT_TXT = "output.txt";

    public static final int POSITION = 1;
    public static final char LETTER = '!';



    public static void main(String[] args) throws DataException, IOException {
        //read text from file
        AcquirerFactory factory = new DataAcquirerFactory();
        DataAcquirer acquirer = factory.createAcquirer();
        List<String> text = acquirer.getText(FILE_INPUT_TXT);

        //transform text
        Transform transform=new TransformerFactory();
        WordProcessing processing=transform.createTransformer();
        List<String> textResult = processing.transformText(text, POSITION, LETTER);


        //print result
        PrintFactory printFactory = new PrintResultFactory();
        Printer printer = printFactory.createPrinter();
        printer.print(textResult, FILE_OUTPUT_TXT);

    }
}
