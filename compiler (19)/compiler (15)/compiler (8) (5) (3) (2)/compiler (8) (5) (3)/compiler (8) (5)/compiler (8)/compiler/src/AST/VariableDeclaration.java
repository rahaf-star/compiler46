package AST;

public class VariableDeclaration extends Instruction {

    TypeAnnotation typeAnnotation;
    Expression expression;
    DeclarationKeyword declarationKeyword;

    public DeclarationKeyword getDeclarationKeyword() {
        return declarationKeyword;
    }

    public void setDeclarationKeyword(DeclarationKeyword declarationKeyword) {
        this.declarationKeyword = declarationKeyword;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    @Override
    public String toString() {
        if (typeAnnotation != null) {
            return "\nVariableDeclaration {" + "typeAnnotation=" + typeAnnotation + "\n}";


        } else if (expression != null) {
            return "\nVariableDeclaration{" + " expression=" + expression + "\n}";


        } else if (declarationKeyword != null) {
            return "\nVariableDeclaration{" + " declarationKeyword=" + declarationKeyword + "\n}";


        }
        return "\nVariableDeclaration{" +
                "\ntypeAnnotation=" + typeAnnotation + "\n" +
                "\nexpression=" + expression + "\n" +
                "\ndeclarationKeyword =" + declarationKeyword  + "\n"


                ;


    }
}
