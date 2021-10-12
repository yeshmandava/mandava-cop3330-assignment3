package ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
*  UCF COP3330 Fall 2021 Assignment 3 Solution
*  Copyright 2021 Yeshwanth Mandava
*/

// Program that takes in information/content from an input file, sorts it, and returns the final list to the output file.
//+ is for public, - is for private


public class NameSorter {
    public static void main(String[] args) throws IOException {

        //Initializes the input and output files
        Sort list=new Sort();
        File ifp = new File("src/main/java/ex41/exercise41_input.txt");
        FileWriter output = new FileWriter("src/main/java/ex41/exercise41_output.txt");
        Scanner input=new Scanner(ifp);

        //Scans in the contents from the input file exercise41_input.txt
        list.ScanIn(input);

        //Sorts the given input file based in alphabetical order
        list.Sort();

        //Prints the resulting list to the out file labeled exercise41_output.txt
        output.write(list.output());

        output.close();
    }
}
