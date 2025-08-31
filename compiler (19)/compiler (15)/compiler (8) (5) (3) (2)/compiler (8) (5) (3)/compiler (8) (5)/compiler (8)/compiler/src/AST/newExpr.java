package AST;

import java.util.List;

public class newExpr implements Primary {
    private String constructorName; // ← ADD THIS FIELD
    private TypeArguments typeArguments;
    private List<Expression> expression;

    public String getConstructorName() {
        return constructorName;
    }

    public void setConstructorName(String constructorName) {
        this.constructorName = constructorName;
    }

    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }

    public TypeArguments getTypeArguments() {
        return typeArguments;
    }

    public void setTypeArguments(TypeArguments typeArguments) {
        this.typeArguments = typeArguments;
    }

    @Override
    public String toString() {
        return "\nnewExpr{" +
                "\nconstructorName='" + constructorName + "'" + // ← ADD THIS
                ", \nexpression=" + expression +
                ", \ntypeArguments=" + typeArguments +
                "\n}";
    }
}