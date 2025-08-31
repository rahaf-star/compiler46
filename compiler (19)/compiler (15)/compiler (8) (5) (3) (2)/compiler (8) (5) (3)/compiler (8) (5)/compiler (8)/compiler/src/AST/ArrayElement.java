package AST;

public class ArrayElement {
    private Expression expressions;
    private boolean isSpread; // ← ADD THIS FIELD

    public Expression getExpressions() {
        return expressions;
    }

    public void setExpressions(Expression expressions) {
        this.expressions = expressions;
    }

    public boolean isSpread() {
        return isSpread;
    }

    public void setSpread(boolean spread) {
        isSpread = spread;
    }

    @Override
    public String toString() {
        return "\nArrayElement{" +
                (isSpread ? "...expression=" : "expression=") + expressions +
                "\n}";
    }
}