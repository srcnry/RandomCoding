package com.missingartifacts.validators;

import java.util.Stack;

public class ParanthesesBalanceChecker {
    public static void main(String args[]){
        String expressions[]={"{}[[]]","]})[{(","[()]{}{[()()]()}", "[(])"};

        for (String expr: expressions) {
            System.out.println(checkBalance(expr));
        }
    }

    public static boolean checkBalance(String expr) {
        Stack<Character> parenthesisStack = new Stack<>();
        char[] tokens = expr.toCharArray();
        for(char ch : tokens) {
            if(ch == '{' || ch == '[' || ch == '(' ) {
                parenthesisStack.add(ch);
            } else if (ch == '}' || ch == ']' || ch == ')' ) {
                if(parenthesisStack.isEmpty()) {
                    return false;
                } else {
                    if(!isMatched(parenthesisStack.pop(), ch)) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }

     return parenthesisStack.isEmpty() ? true : false;
    }

    public static boolean isMatched(char chOpening, char chClosing){
        if(chOpening == '(' && chClosing == ')') {
            return true;
        } else if(chOpening == '{' && chClosing == '}') {
            return true;
        } else if(chOpening == '[' && chClosing == ']') {
            return true;
        }
        return false;
    }

}
