package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Find
{
    public String inputFile;

    public void ScanIn() throws FileNotFoundException
    {
        File input = new File("src/main/java/ex45/exercise45_input.txt");
        Scanner in = new Scanner(input);
        inputFile = "";
        while (in.hasNextLine())
        {
            inputFile = inputFile+in.nextLine() + "\n";
        }

    }

    public String replaceFile()
    {
        inputFile =inputFile.replaceAll("utilize","use");
        return inputFile;
    }

}
