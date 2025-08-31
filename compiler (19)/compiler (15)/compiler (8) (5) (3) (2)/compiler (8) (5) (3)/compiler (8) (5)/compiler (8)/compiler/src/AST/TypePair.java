package AST;

public class TypePair {
    String identifier;
    BaseTypeAnnotation baseTypeAnnotations;


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public BaseTypeAnnotation getBaseTypeAnnotations() {
        return baseTypeAnnotations;
    }

    public void setBaseTypeAnnotations(BaseTypeAnnotation baseTypeAnnotations) {
        this.baseTypeAnnotations = baseTypeAnnotations;
    }

    @Override
    public String toString() {
        return "\nTypePair{" +
                "\nidentifier=" + identifier +
                ", \nbaseTypeAnnotations=" + baseTypeAnnotations +
                "\n}";
    }
}

