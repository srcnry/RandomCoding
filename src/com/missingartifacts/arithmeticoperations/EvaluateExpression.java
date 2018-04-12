package com.missingartifacts.arithmeticoperations;

import java.util.Stack;

public class EvaluateExpression {
    /**
     * A Java program to evaluate a given expression where tokens are separated
        by space.
        Test Cases:
        "10 - 2 * 2"          ---> 6
        "50 * 2 + 7"          ---> 107
        "50 * ( 2 + 8 )"      ---> 500
        "50 * ( 2 + 8 ) / 5"  ---> 100
     */

    public static String operators = "/*-+";

    public static void main(String args[]){
        String expressions[] =  {"10 - 2 * 2" ,"50 * 2 + 7","50 * ( 2 + 8 )","50 * ( 2 + 8 ) / 5" };

        for(int i = 0; i < expressions.length; i++) {
            System.out.println(evaluate(expressions[i]));
        }

    }

    private static double evaluate(String expression) {
        Stack<Double> numberStack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();

        String tokens[] = expression.split(" ");
        for(int i = 0; i<tokens.length; i++) {
            String token = tokens[i];
            if(Operations.isNumeric(token)) {
                numberStack.add(Double.parseDouble(token));
            } else if(token.equals("(")) {
                operatorStack.add(token);
            } else if(token.equals(")")) {
                while(!operatorStack.peek().equals("(")) {
                    double result = Operations.makeOperation(operatorStack.pop(), numberStack.pop(), numberStack.pop());
                    numberStack.add(result);
                }
                operatorStack.pop();

            } else if(operators.contains(token)) {
                while(!operatorStack.isEmpty() && hasPrecedence(token, operatorStack.peek())) {
                    double result = Operations.makeOperation(operatorStack.pop(), numberStack.pop(), numberStack.pop());
                    numberStack.add(result);
                }
                operatorStack.push(token);
            }
        }

        while(!operatorStack.isEmpty()) {
            double result = Operations.makeOperation(operatorStack.pop(), numberStack.pop(), numberStack.pop());
            numberStack.add(result);
        }

        return numberStack.pop();
    }

    public static boolean hasPrecedence(String op1, String op2)
    {
        if (op2.equals("(") || op2.equals(")"))
            return false;
        if ((op1.equals("*") || op1.equals("/")) && (op2.equals("+") || op2.equals("-")))
            return false;
        else
            return true;
    }
}
