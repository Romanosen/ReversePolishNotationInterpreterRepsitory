package com.reversedpnotation.pack;

public class OperandExpression implements IExpression {
    int number;

    public OperandExpression(int i) {
        number = i;
    }

    public OperandExpression(String s) {
        number = Integer.parseInt(s);
    }

    @Override
    public int interpret() {
        return number;
    }
}
