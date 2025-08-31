package AST;

public class Do_while_statement extends ConditionalStatements {
     Block block;
     Value value;

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nDo_while_statement{" +
                "\nblock=" + block +
                ", \nvalue=" + value +
                "\n}";
    }
}
