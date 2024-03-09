package engine;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Stack;

public class ComputationEngine {

    public static double compute(String rpnExpression) {
        String[] tokens = rpnExpression.split("\\s+");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double b = stack.pop(), a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "÷":
                    double divisor = stack.pop(), dividend = stack.pop();
                    stack.push(dividend / divisor);
                    break;
                case "**":
                    double exponent = stack.pop(), base = stack.pop();
                    stack.push(Math.pow(base, exponent));
                    break;
                case "log":
                    stack.push(Math.log10(stack.pop()));
                    break;
                case "ln":
                    stack.push(Math.log(stack.pop()));
                    break;
                case "sin":
                    stack.push(Math.sin(stack.pop()));
                    break;
                case "cos":
                    stack.push(Math.cos(stack.pop()));
                    break;
                case "tan":
                    stack.push(Math.tan(stack.pop()));
                    break;
                case "asin":
                    stack.push(Math.asin(stack.pop()));
                    break;
                case "acos":
                    stack.push(Math.acos(stack.pop()));
                    break;
                case "atan":
                    stack.push(Math.atan(stack.pop()));
                    break;
                case "sinh":
                    stack.push(Math.sinh(stack.pop()));
                    break;
                case "cosh":
                    stack.push(Math.cosh(stack.pop()));
                    break;
                case "tanh":
                    stack.push(Math.tanh(stack.pop()));
                    break;
                case "!":
                    stack.push(factorial(stack.pop()));
                    break;
                default:
                    stack.push(parseNumber(token));
                    break;
            }
        }

        return formatResult(stack.pop());
    }

    private static double parseNumber(String token) {
        if (token.equalsIgnoreCase("π"))
            return Math.PI;
        else if (token.equalsIgnoreCase("e"))
            return Math.E;
        else
            return Double.parseDouble(token);
    }

    private static double formatResult(double result) {
        BigDecimal bd = new BigDecimal(result).setScale(5, RoundingMode.HALF_UP);
        double formatted = bd.doubleValue();
        // Remove trailing zeros
        return formatted == Math.floor(formatted) ? (int) formatted : formatted;
    }

    private static double factorial(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        double result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}
