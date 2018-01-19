package com.reversedpnotation.pack;

import java.util.Stack;

public class InterpretterPattern {
    public static void main(String args[]) {
        Operation operation=Operation.PLUS;
        char plus= operation.asChar();

        String tokenString = "4 3 2 - 1 + *";
        Stack<IExpression> stack = new Stack();

        String[] tokenList = tokenString.split(" ");
        for (String s : tokenList) {
            if (isOperator(s)) {
                IExpression rightExpression = (IExpression) stack.pop();
                IExpression leftExpression = (IExpression) stack.pop();
                IExpression operator = getOperatorInstance(s, leftExpression,
                        rightExpression);
                int result = operator.interpret();
                stack.push(new OperandExpression(result));
            } else {
                IExpression i = new OperandExpression(s);
                stack.push(i);
            }
        }
        System.out.println("Result: " + stack.pop().interpret());
    }

    public static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^"))
            return true;
        else
            return false;
    }

    public static IExpression getOperatorInstance(String s, IExpression left,
                                                  IExpression right) {
        switch (s) {
            case "+":
                return new PlusExpression(left, right);
            case "-":
                return new SubstractionExpression(left, right);
            case "*":
                return new MultiplyExpression(left, right);
            case "/":
                return new MultiplyExpression(left, right);
            case "^":
                return new MultiplyExpression(left, right);

        }
        return null;
    }
}
