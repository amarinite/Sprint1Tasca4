package n1exercici1;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MonthsTest {
    @Test
    public void listShouldNotBeNull() {
        ArrayList<String> months = Months.addMonths();

        assertNotNull(months);
    }

    @Test
    public void listShouldHave12Items() {
        ArrayList<String> months = Months.addMonths();

        assertEquals(12, months.size());
    }

    @Test
    public void augustShouldBeInPosition8() {
        ArrayList<String> months = Months.addMonths();

        assertEquals("august", months.get(7));
    }
}