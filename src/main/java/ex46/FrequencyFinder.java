package ex46;
import java.io.FileNotFoundException;

/**
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

/**
 * Create a program that reads in a file named `exercise46_input.txt` and counts the frequency of words in the file.
 * Then construct a histogram displaying the words and the frequency, and display the histogram to the screen.
 */


public class FrequencyFinder
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Construct FreqFind = new Construct();
        FreqFind.findQuantity();
        FreqFind.Sort();
        FreqFind.printNum();

    }

}
