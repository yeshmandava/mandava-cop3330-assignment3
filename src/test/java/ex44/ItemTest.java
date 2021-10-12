package ex44;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest extends TestCase {
    Item item = new Item();
    public void testProductRetrieved() throws FileNotFoundException
    {
        item.ScanProduct();
        assertEquals(true,item.RetrieveItem("Widget"));
    }

    public void testProductNotRetrieved() throws FileNotFoundException
    {
        item.ScanProduct();
        assertEquals(false,item.RetrieveItem("Cars"));

    }

}