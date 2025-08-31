package AST;

import java.util.List;

public  class ArithmeticExpression  extends Expression{
    List<PostFix_Expression >expression;

    public List<PostFix_Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<PostFix_Expression> expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nArithmeticExpression{" +
                "\nexpression=" + expression +
                "\n}";
    }
}
