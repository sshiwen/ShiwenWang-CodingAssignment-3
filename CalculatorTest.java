import antlr.CalculatorGrammarLexer;
import antlr.CalculatorGrammarParser;
import engine.ComputationEngine;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;
import util.ReversePolishNotation;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testSimpleArithmetic() {
        assertEquals(5, ComputationEngine.compute("3 2 +"), "3 + 2 should equal 5");
        assertEquals(1, ComputationEngine.compute("3 2 -"), "3 - 2 should equal 1");
        assertEquals(6, ComputationEngine.compute("3 2 *"), "3 * 2 should equal 6");
        assertEquals(1.5, ComputationEngine.compute("3 2 ÷"), "3 ÷ 2 should equal 1.5");
    }

    @Test
    public void testComplexExpression() {
        assertEquals(141, ComputationEngine.compute("3 5 8 * 7 + *"), "3 * (5 * 8 + 7) should equal 141");
        // (1+2)!÷(3-4**2)
        assertEquals(-0.46154, ComputationEngine.compute("1 2 + ! 3 4 2 ** - ÷"), "(1+2)!÷(3-4**2) should equal -0.46154");
    }

    @Test
    public void testFunctionsAndConstants() {
        assertEquals(Math.log10(10), ComputationEngine.compute("10 log"), "log(10) should equal 1");
        assertEquals(0.5, ComputationEngine.compute("π 6 ÷ sin"), "sin(π ÷ 6) should equal 0.5");
        // ln(e**3)
        assertEquals(3, ComputationEngine.compute("e 3 ** ln"), "ln(e**3) should equal 3");
    }

    @Test
    public void testFormatting() {
        assertEquals(2, ComputationEngine.compute("2.00000"), "2.00000 should be formatted as 2");
        assertEquals(2.12346, ComputationEngine.compute("2.1234567"), "2.1234567 should be rounded to 2.12346");
    }

    @Test
    public void testFactorialDivide() {
        String input = "(1+2)!÷(3-4**2)";
        String expectedRPN = "1 2 + ! 3 4 2 ** - ÷";
        double expectedResult = -0.46154;
        CalculatorGrammarLexer lexer = new CalculatorGrammarLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorGrammarParser parser = new CalculatorGrammarParser(tokens);
        CalculatorGrammarParser.ExprContext tree = parser.expr();

        ReversePolishNotation visitor = new ReversePolishNotation();
        String actualRPN = visitor.visit(tree);
        assertEquals(expectedRPN, actualRPN, "RPN expression for (1+2)!÷(3-4**2)");
        double actualResult = ComputationEngine.compute(actualRPN);
        assertEquals(expectedResult, actualResult, 0.00001, "Computation result for (1+2)!÷(3-4**2)");
    }

    @Test
    public void testSinFunction() {
        String input = "sin(π÷6)";
        String expectedRPN = "π 6 ÷ sin";
        double expectedResult = 0.5;
        CalculatorGrammarLexer lexer = new CalculatorGrammarLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorGrammarParser parser = new CalculatorGrammarParser(tokens);
        CalculatorGrammarParser.ExprContext tree = parser.expr();

        ReversePolishNotation visitor = new ReversePolishNotation();
        String actualRPN = visitor.visit(tree);
        assertEquals(expectedRPN, actualRPN, "RPN expression for sin(π÷6)");
        double actualResult = ComputationEngine.compute(actualRPN);
        assertEquals(expectedResult, actualResult, 0.00001, "Computation result for sin(π÷6)");
    }

    @Test
    public void testLnFunction() {
        String input = "ln(e**3)";
        String expectedRPN = "e 3 ** ln";
        double expectedResult = 3;
        CalculatorGrammarLexer lexer = new CalculatorGrammarLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorGrammarParser parser = new CalculatorGrammarParser(tokens);
        CalculatorGrammarParser.ExprContext tree = parser.expr();

        ReversePolishNotation visitor = new ReversePolishNotation();
        String actualRPN = visitor.visit(tree);
        assertEquals(expectedRPN, actualRPN, "RPN expression for ln(e**3)");
        double actualResult = ComputationEngine.compute(actualRPN);
        assertEquals(expectedResult, actualResult, 0.00001, "Computation result for ln(e**3)");
    }
}
