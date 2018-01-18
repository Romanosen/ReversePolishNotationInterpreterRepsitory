package com.reversedpnotation.pack;

public class DivisionExpression implements IExpression {
    IExpression leftExpression;
    IExpression rightExpresion;

    public DivisionExpression(IExpression leftExpression,
                              IExpression rightExpresion) {
        this.leftExpression = leftExpression;
        this.rightExpresion = rightExpresion;
    }

    @Override
    public int interpret() {

        return leftExpression.interpret() / rightExpresion.interpret();
    }
}
