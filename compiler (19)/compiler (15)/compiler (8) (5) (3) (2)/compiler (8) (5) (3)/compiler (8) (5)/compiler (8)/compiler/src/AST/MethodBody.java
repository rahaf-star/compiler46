package AST;

import java.util.List;

public class MethodBody {
List<VariableDeclaration> variableDeclaration;
List<Return_statement> returnStatement;
List<Expression> expression;



    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }

    public List<Return_statement> getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(List<Return_statement> returnStatement) {
        this.returnStatement = returnStatement;
    }

    public List<VariableDeclaration> getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(List<VariableDeclaration> variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    @Override
    public String toString() {
        return "\nMethodBody{" +
                ", \nvariableDeclaration=" + variableDeclaration +
                ", \nreturnStatement=" + returnStatement +
                ", \nexpression=" + expression +
                "\n}";
    }
}
