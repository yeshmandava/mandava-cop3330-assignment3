package ex44;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

/**
 * Create a program that takes a product name as input and retrieves the current price and quantity for that product.
 * The product data is in a data file in the JSON format  and looks like this
 * (you will create this file as `exercise44_input.json`):
 */

public class ProductSearch
{
    public static void main(String[] args) throws FileNotFoundException {
        //migrates Item class
        Item readIn = new Item();
        readIn.ScanProduct();

        Scanner input = new Scanner(System.in);
        System.out.print("What is the product name: ");
        String ProductName = input.nextLine();
        while (!readIn.RetrieveItem(ProductName)) {
            System.out.println("Sorry, that product was not found in our inventory.");
            System.out.print("What is the product name? ");
            ProductName = input.nextLine();
        }
    }
}
