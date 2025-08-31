package AST;

public  class UnaryExpression extends Expression{
  Value value;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nUnaryExpression{" +
                "\nvalue=" + value +
                "\n}";
    }
}
