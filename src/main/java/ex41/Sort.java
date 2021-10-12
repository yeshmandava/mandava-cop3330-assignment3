package ex41;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
    private ArrayList<Scan> nameList=new ArrayList<Scan>();

    public void ScanIn(Scanner input) throws FileNotFoundException {
        //read in the info
        //store it in array
        while(input.hasNextLine()){
            Scan names=new Scan();
            names.ScanPeople(input);
            nameList.add(names);
        }
    }
    public void Sort(){
        //Calls the COMPARATOR method from the Scan class
        Collections.sort(nameList,Scan.COMPARE_BY_NAME);
    }
    public String output(){
      //Prints out the final sorted list to the output file
        String finalF="Total of "+nameList.size()+" names\n"+"-------------------------\n";
        for(Scan person: nameList){
            finalF+=person+"\n";
        }
        return finalF;
    }
}