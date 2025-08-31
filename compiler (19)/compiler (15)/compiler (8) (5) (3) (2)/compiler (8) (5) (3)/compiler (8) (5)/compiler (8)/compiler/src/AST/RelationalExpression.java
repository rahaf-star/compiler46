package AST;

import java.util.List;

public  class RelationalExpression  extends Expression{
    List<PostFix_Expression >expression;

    public List<PostFix_Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<PostFix_Expression> expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\nRelationalExpression{" +
                "\nexpression=" + expression +
                "\n}";
    }
}

