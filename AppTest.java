package lektion2;

import org.junit.Test;
import se.bergkvist.App;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class AppTest

{

    @Test
    public void testCounterstring10()
    {
        int input1 = 10;
        String expected = "1*3*5*7*10";
        String actual = App.counterString(input1);

        assertEquals(expected, actual);
    }
    @Test
    public void testCounterstring17()
    {
        int input1 = 17;
        String expected = "*2*4*6*8*11*14*17";
        String actual = App.counterString(input1);

        assertEquals(expected, actual);
    }
    @Test
    public void testCounterstring20()
    {
        int input1 = 20;
        String expected = "*2*4*6*8*11*14*17*20";
        String actual = App.counterString(input1);

        assertEquals(expected, actual);
    }
}
