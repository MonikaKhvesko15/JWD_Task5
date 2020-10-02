package com.epam.task5;

import com.epam.task5.data.*;
import com.epam.task5.logic.*;
import com.epam.task5.view.OutputType;
import com.epam.task5.view.PrintFactory;
import com.epam.task5.view.PrintResultFactory;
import com.epam.task5.view.Printer;

import java.io.IOException;
import java.util.List;

public class Main {

    public static final int POSITION = 5;
    public static final char LETTER = 'f';

    public static void main(String[] args) throws DataException, IOException {
        //read text from file
        AcquirerFactory factory = new DataAcquirerFactory();
        DataAcquirer acquirer = factory.createAcquirer(InputType.FILE);//CONSOLE
        List<String> text = acquirer.getText();

        //transform text
        Transform transform=new TransformerFactory();
        WordProcessing processing=transform.createTransformer(TransformType.STRING);//REGEX
        List<String> textResult = processing.transformText(text, POSITION, LETTER);


        //print result
        PrintFactory printFactory = new PrintResultFactory();
        Printer printer = printFactory.createPrinter(OutputType.FILE);//CONSOLE
        printer.print(textResult);

    }
}
