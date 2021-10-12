package ex46;

import junit.framework.TestCase;

import java.io.FileNotFoundException;

public class ConstructTest extends TestCase
{
    Construct construct = new Construct();

    public void testFrequency() throws FileNotFoundException
    {
        construct.findQuantity();
        construct.Sort();
        String expected="badger:   *******\n" +
                        "mushroom: **\n" +
                        "snake:    *\n";
        String actual = testNum();
        assertEquals(expected,actual);
    }


    public String testNum()
    {

        String actual="";
        for(Construct.Word tmp :construct.List) {
            actual += (String.format("%-10s", (tmp.word + ":")));
            for (int i = 0; i < tmp.frequency; i++) {
                actual += "*";
            }
            actual += "\n";
        }
        return actual;
    }


}

