package ex42;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

// Program that takes in information/content from an input file, parses the data, formats it into a table and then prints to console
//+ is for public, - is for private


public class ParseData
{
    public static void main(String[] args) throws IOException {

        //Initializes the input file and scans in the contents
        Sort2 list=new Sort2();
        File ifp = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner input=new Scanner(ifp);

        //Scans in the contents from the input file exercise41_input.txt
        list.ScanIn(input);

        //Prints the resulting list to the console log
        System.out.print(list.output());
    }
}
