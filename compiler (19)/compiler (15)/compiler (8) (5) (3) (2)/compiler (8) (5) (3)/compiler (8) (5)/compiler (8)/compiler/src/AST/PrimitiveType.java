package AST;

public class PrimitiveType extends BaseTypeAnnotation {
    String type;



    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\nPrimitiveType{" +
                "\ntype='" + type + '\'' +
                "\n}";
    }
}
