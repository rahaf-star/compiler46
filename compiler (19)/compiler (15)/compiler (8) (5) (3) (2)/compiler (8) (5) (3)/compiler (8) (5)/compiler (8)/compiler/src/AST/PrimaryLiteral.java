package AST;

public class PrimaryLiteral implements Primary {
    private String value;
    private String type; // "string", "number", "template"

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PrimaryLiteral{value='" + value + "', type='" + type + "'}";
    }
}
