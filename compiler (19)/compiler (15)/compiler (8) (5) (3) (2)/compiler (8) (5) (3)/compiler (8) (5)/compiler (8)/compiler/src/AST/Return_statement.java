package AST;

public class Return_statement extends ConditionalStatements {
    Expression expression; // Change from ExpressionSequence to Expression

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nReturn_statement{" +
                "\nexpression=" + expression +
                "\n}";
    }
}
