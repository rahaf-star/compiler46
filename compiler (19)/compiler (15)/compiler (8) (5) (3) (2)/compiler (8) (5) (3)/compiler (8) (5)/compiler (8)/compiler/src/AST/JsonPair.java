package AST;



public class JsonPair {
Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nJsonPair{" +
                "\nexpression=" + expression +
                "\n}";
    }
}