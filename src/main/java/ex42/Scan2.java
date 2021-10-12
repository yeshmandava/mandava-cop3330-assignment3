package ex42;

import javax.management.monitor.CounterMonitorMBean;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Scan2 {
    private String lastN;
    private String firstN;
    private String sal;


    public void ScanPeople(Scanner input) throws FileNotFoundException {
        //reads in the line
        //stores the index of the comma to use for storing thr first and last names based on its relativity
        String file = input.nextLine();
        List<String> infoList = Arrays.asList(file.split(","));

        //stores all characters before the comma as the last name
        lastN = infoList.get(0);

        //stores all characters 2 spaces after the comma as the first name
        firstN = infoList.get(1);

        sal = infoList.get(2);
    }

    public String toString() //Method to format the info into specific order for the table
    {
        return String.format("%-15s %-15s %-15s", lastN, firstN,sal);
    }

}