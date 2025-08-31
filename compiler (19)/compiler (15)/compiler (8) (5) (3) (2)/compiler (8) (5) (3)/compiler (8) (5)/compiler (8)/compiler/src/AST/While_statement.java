package AST;

public class While_statement extends ConditionalStatements {
     Value value;
     Block block;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "\nWhile_statement{" +
                "\nvalue=" + value +
                ", \nblock=" + block +
                "\n}";
    }
}
