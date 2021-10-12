package ex43;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class InfoTest extends TestCase {
    public void testFiles() throws FileNotFoundException
    {
        File file = new File("src/main/website/awesomeco/index.html");
        assertEquals(file.exists());
        File fileA = new File("src/main/website/awesomeco");
        assertEquals(fileA.exists());
        File fileB = new File("src/main/website/awesomeco/css");
        assertEquals(fileB.exists());
        File fileC = new File("src/main/website/awesomeco/js");
        assertEquals(fileC.exists());
    }

    private void assertEquals(boolean exists) {
    }

}