package AST;

import java.util.List;

public class Assignment extends Expression {
    PostFix_Expression postFixExpression;
    Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public PostFix_Expression getPostFixExpression() {
        return postFixExpression;
    }

    public void setPostFixExpression(PostFix_Expression postFixExpression) {
        this.postFixExpression = postFixExpression;
    }

    @Override
    public String toString() {
        return "\nAssignment{" +
                "\nexpression=" + expression +
                ", \npostFixExpression=" + postFixExpression +
                "\n}";
    }
}
