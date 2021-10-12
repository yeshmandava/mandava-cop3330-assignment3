package ex41;

import junit.framework.TestCase;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class SortTest extends TestCase {
    public void testFinalList() throws FileNotFoundException
    {
        Sort sort = new Sort();
        File in = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner input = new Scanner(in);
        sort.ScanIn(input);
        sort.Sort();
        String result="Total of 7 names\n"
                        + "-------------------------\n"
                        + "Johnson, Jim\n"
                        + "Jones, Aaron\n"
                        + "Jones, Chris\n"
                        + "Ling, Mai\n"
                        + "Swift, Geoffrey\n"
                        + "Xiong, Fong\n"
                        + "Zarnecki, Sabrina\n";
        assertEquals(sort.output(),result);
    }
}






