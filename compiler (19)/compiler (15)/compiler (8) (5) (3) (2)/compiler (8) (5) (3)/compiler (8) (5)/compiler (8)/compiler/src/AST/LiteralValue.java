package AST;


public class LiteralValue extends Value implements Primary  {

 String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nLiteralValue{" +
                "\ntype='" + type + '\'' +
                "\n}";
    }
}
