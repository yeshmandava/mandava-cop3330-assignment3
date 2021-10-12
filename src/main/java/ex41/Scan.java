package ex41;

import javax.management.monitor.CounterMonitorMBean;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;

public class Scan {
        private String lastN;
        private String firstN;


        public void ScanPeople(Scanner input) throws FileNotFoundException {
                //reads in the line
                //stores the index of the comma to use for storing thr first and last names based on its relativity
                String file=input.nextLine();
                int comma=file.indexOf(",");

                //stores all characters before the comma as the last name
                lastN=file.substring(0, comma);

                //stores all characters 2 spaces after the comma as the first name
                firstN=file.substring(comma+2,file.length());
        }

        public String LastName() //return Last Name
        {
                return lastN;
        }
        public String FirstName() //returns first name
        {
                return firstN;
        }
        public String toString() //Method to return the full name in readable text as a string
        {
                return lastN+", "+firstN;
        }

        //Compares the first and last names among the list to alphabetize
        public static Comparator<Scan> COMPARE_BY_NAME = new Comparator<Scan>() {
                public int compare(Scan first, Scan next) {
                        return (first.LastName()+first.FirstName()+first).compareTo(next.LastName()+next.FirstName());
                }
        };
}