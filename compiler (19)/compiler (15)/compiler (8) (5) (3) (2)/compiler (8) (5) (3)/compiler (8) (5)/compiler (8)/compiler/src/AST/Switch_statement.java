package AST;

public class Switch_statement extends ConditionalStatements {
    Value value;
    Switch_body switchBody;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Switch_body getSwitcBody() {
        return switchBody;
    }

    public void setSwitcBody(Switch_body switcBody) {
        this.switchBody = switcBody;
    }

    @Override
    public String toString() {
        return "\nSwitch_statement{" +
                "\nvalue=" + value +
                ", \nswitchBody=" + switchBody +
                "\n}";
    }
}
