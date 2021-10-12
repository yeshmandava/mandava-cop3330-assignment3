package ex45;

import junit.framework.TestCase;
import org.junit.Test;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

public class FindTest extends TestCase {
    Find find = new Find();
    public void testFinalText() throws FileNotFoundException
    {
        find.inputFile = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".";

        String finalText = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
            "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
            "uses an IDE to write her Java programs\".";

        assertEquals(finalText,find.replaceFile());

    }
}