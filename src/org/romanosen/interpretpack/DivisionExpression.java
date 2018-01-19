package org.romanosen.interpretpack;

import org.romanosen.interpretpack.IExpression;

public class DivisionExpression implements IExpression {
    IExpression leftExpression;
    IExpression rightExpresion;

    public DivisionExpression(IExpression leftExpression,
                              IExpression rightExpresion) {
        this.leftExpression = leftExpression;
        this.rightExpresion = rightExpresion;
    }
    public DivisionExpression() {

    }

    @Override
    public String interpret() {

        return new String(leftExpression.interpret() + rightExpresion.interpret()+"/");
    }
}
