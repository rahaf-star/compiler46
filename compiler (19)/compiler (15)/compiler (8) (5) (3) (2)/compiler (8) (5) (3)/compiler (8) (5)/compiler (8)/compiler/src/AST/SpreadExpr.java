package AST;

public class SpreadExpr implements Primary{
    Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nSpreadExpr{" +
                "\nexpression=" + expression +
                "\n}";
    }
}
