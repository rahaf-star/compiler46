package AST;

public class Eos {
     String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nEos{" +
                "\ntype='" + type + '\'' +
                "\n}";
    }
}
