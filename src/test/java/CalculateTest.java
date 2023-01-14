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

    @Test
    public void testAverageExpression(){
        String expression = "3*(2-3)";
        String expectedAnswer = "-3.0";
        assertEquals(expectedAnswer, Calculator.CalculateLine(expression));

        expression = "14/(7-5)*2";
        expectedAnswer = "14.0";
        assertEquals(expectedAnswer,Calculator.CalculateLine(expression));

        expression = "12-(100/25)+(10)";
        expectedAnswer = "18.0";
        assertEquals(expectedAnswer,Calculator.CalculateLine(expression));
    }

    @Test
    public void testDifficultExpression(){
        String expression = "3*(3*(3*(3)))";
        String expectedAnswer = "81.0";
        assertEquals(expectedAnswer, Calculator.CalculateLine(expression));

        expression = "(14-(3*2/(2-3)))";
        expectedAnswer = "20.0";
        assertEquals(expectedAnswer,Calculator.CalculateLine(expression));

        expression = "17*2-((12-11)*((4) - 3))";
        expectedAnswer = "33.0";
        assertEquals(expectedAnswer,Calculator.CalculateLine(expression));
    }

    @Test
    public void testDivisionByZero(){
        String expression = "1/0";
        String expectedAnswer = "Division by zero!";
        assertEquals(expectedAnswer, Calculator.CalculateLine(expression));

        expression = "2- (14/0)";
        expectedAnswer = "Division by zero!";
        assertEquals(expectedAnswer,Calculator.CalculateLine(expression));

        expression = "100/((13-13) + (100-50)*(2-2))";
        expectedAnswer = "Division by zero!";
        assertEquals(expectedAnswer,Calculator.CalculateLine(expression));
    }
}
