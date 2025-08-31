package AST;

public class PrimaryThis implements Primary {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PrimaryThis{value='" + value + "'}";
    }
}