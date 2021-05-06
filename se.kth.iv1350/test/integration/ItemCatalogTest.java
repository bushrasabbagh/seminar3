package integration;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemCatalogTest {

    @Test
    public void testItemExists() {
        String tomat = "Tomat";
        boolean expectedResult = true;
        ItemCatalog itemCatalog = new ItemCatalog();
        boolean actualResult = itemCatalog.itemExists(tomat);
        assertEquals("The expected item didn't exist in database.", expectedResult, actualResult);

    }
}
