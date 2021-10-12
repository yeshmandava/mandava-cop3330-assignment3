package ex43;

import java.io.IOException;

/**
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

/**
 * Create a program that generates a website skeleton with the following specifications:
 * Prompt for the name of the site.
 * Prompt for the author of the site.
 * Ask if the user wants a folder for JavaScript files.
 * Ask if the user wants a folder for CSS files.
 * Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
 */
 //System.out.println("Working Directory = " + System.getProperty("user.dir"));

public class GenerateWebsite
{
    public static void main(String[] args) throws IOException
    {
        //Migrates info class to App
        //Calls all the functions from the Info class
        Info generate = new Info();
        generate.UserInput();
        generate.createWeb();

    }

}

