package com.missingartifacts.arithmeticoperations;

import java.util.Stack;

public class EvaluatePostfixExpression {

    private static String operators = "/*+-";  // available operators

    public static void main(String args[]){
        String expressions[] = {"2 3 1 * + 9 -"};  // result is -4

        for(String expression : expressions) {
            System.out.println(evaluate(expression));
        }

    }

    public static double evaluate(String expr){
        Stack<Double> valueStack = new Stack<>();       // operand values added to this stack
        Stack<String> operatorStack = new Stack<>();    // operators values added to this stack

        String[] tokens = expr.split(" ");      // expression is splitted with delimeter space/ " "

        for(int i = 0; i<tokens.length; i++) {         // loop over the all tokens
            String token = tokens[i];

            if(Operations.isNumeric(token)) {
                valueStack.add(Double.parseDouble(token));
            } else if(operators.contains(token)) {
                double result = Operations.makeOperation(token, valueStack.pop(), valueStack.pop());
                valueStack.add(result);
            }
        }
        return valueStack.isEmpty() ? 0 : valueStack.pop();
    }

}
