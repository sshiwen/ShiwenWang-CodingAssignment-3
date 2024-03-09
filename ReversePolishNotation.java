package util;

import antlr.CalculatorGrammarBaseVisitor;
import antlr.CalculatorGrammarParser;

public class ReversePolishNotation extends CalculatorGrammarBaseVisitor<String> {

    @Override
    public String visitExpr(CalculatorGrammarParser.ExprContext ctx) {
        if (ctx.SIN() != null || ctx.COS() != null || ctx.TAN() != null || ctx.ASIN() != null || ctx.ACOS() != null || ctx.ATAN() != null || ctx.SINH() != null || ctx.COSH() != null || ctx.TANH() != null || ctx.LN() != null || ctx.LOG() != null) {
            String functionName = ctx.SIN() != null ? "sin" : ctx.COS() != null ? "cos" : ctx.TAN() != null ? "tan" : ctx.ASIN() != null ? "asin" : ctx.ACOS() != null ? "acos" : ctx.ATAN() != null ? "atan" : ctx.SINH() != null ? "sinh" : ctx.COSH() != null ? "cosh" : ctx.TANH() != null ? "tanh" : ctx.LN() != null ? "ln" : "log";
            String expr = visit(ctx.expr(0)); // Visit the expression argument of the function
            return expr + " " + functionName; // Append function name to RPN
        } else if (ctx.number() != null) { // If it's a number
            return ctx.number().getText();
        } else if (ctx.function() != null) { // If it's a function call
            String expr = visit(ctx.expr(0)); // Visit the expression argument of the function
            return expr + " " + ctx.function().getText(); // Append function name to RPN
        } else if (ctx.op != null && ctx.expr().size() == 2) { // If it's a binary operation
            String left = visit(ctx.expr(0)); // Visit left subtree
            String right = visit(ctx.expr(1)); // Visit right subtree
            return left + " " + right + " " + ctx.op.getText();
        } else if (ctx.op != null && ctx.expr().size() == 1) { // Unary operations, handled above for functions
            String expr = visit(ctx.expr(0));
            return expr + " " + ctx.op.getText();
        } else if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")) { // Handling parentheses
            return visit(ctx.expr(0));
        } else if (ctx.getChildCount() == 2 && ctx.getChild(1).getText().equals("!")) { // Handling factorial
            String expr = visit(ctx.expr(0));
            return expr + " !";
        }
        return visitChildren(ctx); // Default case
    }

}
