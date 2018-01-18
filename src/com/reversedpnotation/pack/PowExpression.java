package com.reversedpnotation.pack;

public class PowExpression implements IExpression {
    IExpression leftExpression;
    IExpression rightExpresion;

    public PowExpression(IExpression leftExpression,
                         IExpression rightExpresion) {
        this.leftExpression = leftExpression;
        this.rightExpresion = rightExpresion;
    }

    @Override
    public int interpret() {

        return leftExpression.interpret() ^ rightExpresion.interpret();
    }
}