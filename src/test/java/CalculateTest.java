import Parsers.Calculator;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void testEasyExpression(){
        String expression = "2 + 3 +4";
        String expectedAnswer = "9.0";
        assertEquals(expectedAnswer, Calculator.CalculateLine(expression));

        expression = "2 - 3 *2";
        expectedAnswer = "-4.0";
        assertEquals(expectedAnswer,Calculator.CalculateLine(expression));

        expression = "14/2 - 7";
        expectedAnswer = "0.0";
        assertEquals(expectedAnswer,Calculator.CalculateLine(expression));

    }
}
