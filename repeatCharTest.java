package se.bergkvist;
/**
 * Created by davidbergkvist on 2016-12-14.
 */
import org.junit.Test;

public class repeatCharTest
{
    @Test
    public void testRepeatCharSingle() {
        char input1 = '!';
        int input2 = 1;
        String expected = "!";
        String actual = App.repeatChar(input1, input2);
        assertEquals(expected, actual);
    }

    private void assertEquals(String expected, String actual) {
    }

    @Test
    public void testRepeatCharMultiple() {
        char input1 = '!';
        int input2 = 3;
        String expected = "!!!";
        String actual = App.repeatChar(input1, input2);
        assertEquals(expected, actual);
    }
    @Test
    public void testRepeatCharNone() {
        char input1 = '!';
        int input2 = 0;
        String expected = "";
        String actual = App.repeatChar(input1, input2);
        assertEquals(expected, actual);
    }
}
