package engine;

import antlr.CalculatorGrammarLexer;
import antlr.CalculatorGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import util.ReversePolishNotation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an expression:");
            String expression = scanner.nextLine();

            // Check for end of input indication, could be an empty line or specific word like "quit"
            if (expression.isEmpty() || expression.equalsIgnoreCase("quit")) {
                break;
            }

            CalculatorGrammarLexer lexer = new CalculatorGrammarLexer(CharStreams.fromString(expression));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CalculatorGrammarParser parser = new CalculatorGrammarParser(tokens);
            CalculatorGrammarParser.ExprContext tree = parser.expr();

            ReversePolishNotation visitor = new ReversePolishNotation();
            String rpnExpression = visitor.visit(tree);
            System.out.println("Input expression: " + expression); // Original infix expression
            System.out.println("Reverse Polish expression: " + rpnExpression); // Reverse Polish Notation expression
            double result = ComputationEngine.compute(rpnExpression);
            System.out.println("Computation result: " + formatResult(result)); // Computation result
            System.out.println();
        }

        scanner.close();
    }
    private static String formatResult(double result) {
        // Format result as per specifications
        if ((long) result == result) {
            // It's a whole number, print without a decimal point
            return String.format("%d", (long) result);
        } else {
            // It's a decimal, print with up to 5 decimal places, but without trailing zeros
            return String.format("%s", new BigDecimal(result).setScale(5, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString());
        }
    }
}