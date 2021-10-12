package ex42;

import junit.framework.TestCase;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class Sort2Test extends TestCase
{
    public void testResultList2() throws FileNotFoundException
    {
        Sort2 sort2 = new Sort2();
        File in = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner input = new Scanner(in);
        sort2.ScanIn(input);
        String expected="Last            First           Salary\n" +
                "---------------------------------------------\n" +
                "Ling            Mai             55900          \n" +
                "Johnson         Jim             56500          \n" +
                "Jones           Aaron           46000          \n" +
                "Jones           Chris           34500          \n" +
                "Swift           Geoffrey        14200          \n" +
                "Xiong           Fong            65000          \n" +
                "Zarnecki        Sabrina         51500          \n";
        assertEquals(expected,sort2.output());
    }


}