package AST;

import java.util.List;

public class TypeArguments {
    List<TypeAnnotation> typeAnnotations;

    public List<TypeAnnotation> getTypeAnnotations() {
        return typeAnnotations;
    }

    public void setTypeAnnotations(List<TypeAnnotation> typeAnnotations) {
        this.typeAnnotations = typeAnnotations;
    }

    @Override
    public String toString() {
        return "\nTypeArguments{" +
                "\ntypeAnnotations=" + typeAnnotations +
                "\n}";
    }
}
