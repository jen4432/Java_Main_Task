package Parsers;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.parsertokens.Token;

import java.util.ArrayList;


public class Calculator {
    private static final String DivisionByZeroMessage = "Division by zero!";

    public static String CalculateLine(String input) {
        var expression = new Expression(input);
        if (expression.checkSyntax()) {
            var result = expression.calculate();
            if (Double.isNaN(result)) {
                return DivisionByZeroMessage;
            }
            return String.valueOf(result);
        }
        return input;
    }

    public static ArrayList<String> CalculateLines(ArrayList<String> lines){
        ArrayList<String> result = new ArrayList<String>();
        for(var i : lines){
            result.add(CalculateLine(i));
        }
        return result;
    }


}
