package com.missingartifacts.arithmeticoperations;

public class Operations {
    public static double makeOperation(String operator, double operand2, double operand1){
        double result = 0;
        if(operator.equals("*")) {
            result = operand1 * operand2;
        } else if (operator.equals("/")) {
            result = operand1 / operand2;
        } else if (operator.equals("-")) {
            result = operand1 - operand2;
        } else if (operator.equals("+")) {
            result = operand1 + operand2;
        } else {
            throw new RuntimeException("Undefined operator....");
        }
        return result;
    }

    public static boolean isNumeric(String str)
    {
        //return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
        return str.matches("^\\d+(\\.\\d+)?");
        /**
         * thanks to vogella.com
         * ^ defines that the pattern must start at beginning of a new line.
         * \d+ matches one or several digits.
         * The ? makes the statement in brackets optional. \. matches ".", parentheses are used for grouping.
         * Matches for example "5", "1.5" and "2.21".
         */

    }
}
