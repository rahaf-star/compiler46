package AST;

public class Html_attribute {
    private Expression expression; // the expression node

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nHtml_attribute{" +
                "\nexpression=" + expression +
                "\n}";
    }
}
