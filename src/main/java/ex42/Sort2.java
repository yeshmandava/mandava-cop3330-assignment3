package ex42;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sort2 {
    private ArrayList<Scan2> nameList= new ArrayList<>();

    public void ScanIn(Scanner input) throws FileNotFoundException {
        //read in the info
        //store it in array
        while(input.hasNextLine()){
            Scan2 names=new Scan2();
            names.ScanPeople(input);
            nameList.add(names);
        }
    }

    public String output(){
        //Prints out the final parsed list to the console
        String finalF=String.format("%-15s %-15s %-15s\n","Last","First","Salary\n---------------------------------------------");
        for(Scan2 person: nameList){
            finalF+=person+"\n";
        }
        return finalF;
    }
}