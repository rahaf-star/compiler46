package AST;

public class PrimaryBoolean  implements Primary {
    private boolean value;

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PrimaryBoolean{value=" + value + "}";
    }
}
