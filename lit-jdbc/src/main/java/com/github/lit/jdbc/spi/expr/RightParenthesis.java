package com.github.lit.jdbc.spi.expr;

import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.ExpressionVisitor;

/**
 * User : liulu
 * Date : 2017/5/28 23:25
 * version $Id: RightParenthesis.java, v 0.1 Exp $
 */
public class RightParenthesis implements Expression {

    private Expression expression;
    private boolean not = false;

    public RightParenthesis() {
    }

    public RightParenthesis(Expression expression) {
        setExpression(expression);
    }

    public Expression getExpression() {
        return expression;
    }

    public final void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void accept(ExpressionVisitor expressionVisitor) {
//        expressionVisitor.visit(this);
    }

    public void setNot() {
        not = true;
    }

    public boolean isNot() {
        return not;
    }

    @Override
    public String toString() {
        return (not ? "NOT " : "") + expression + " )";
    }
}