package ex45;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

/**
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

/**
 * Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize.
 * Replace each occurrence with use. Write the modified file to a new file.
 */


public class WordReplace
{
    public static void main(String[] args) throws IOException
    {
        Find find = new Find();
        FileWriter output = new FileWriter("src/main/java/ex45/exercise45_output.txt");

        find.ScanIn();

        output.write(find.replaceFile());

        output.close();

    }

}
