package AST;

public class PropertyDeclaration extends Class_Body {

    String identifier;
    TypeAnnotation typeAnnotation;
    Expression expression;
    String visibility; // ← ADD THIS
    boolean isOutput;  // ← ADD THIS


    // Add getters and setters
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public boolean isOutput() {
        return isOutput;
    }

    public void setOutput(boolean output) {
        isOutput = output;
    }




    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }





    @Override
    public String toString() {
        return "\nPropertyDeclaration{" +

                ", \nidentifier='" + identifier + '\'' +
                ", \ntypeAnnotation=" + typeAnnotation +
                ", \nexpression=" + expression +


                "\n}";
    }
}