package AST;

public class ArrayType extends  BaseTypeAnnotation{
    String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "\nArrayType{" +
                "\nidentifier=" + identifier +
                "\n}";
    }
}
