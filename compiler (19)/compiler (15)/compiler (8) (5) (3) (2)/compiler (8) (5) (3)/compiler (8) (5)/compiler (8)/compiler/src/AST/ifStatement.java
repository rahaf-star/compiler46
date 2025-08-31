package AST;

import java.util.List;

public class ifStatement extends ConditionalStatements{
List<Block> block;

 ifStatement IfStat;

Expression expression;


    public List<Block> getBlock() {
        return block;
    }

    public void setBlock(List<Block> block) {
        this.block = block;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public ifStatement getIfStat() {
        return IfStat;
    }

    public void setIfStat(ifStatement ifStat) {
        IfStat = ifStat;
    }

    @Override
    public String toString() {
        if (IfStat != null) {
            return "\nifStatement {" + " ifStatement=" +IfStat + "\n}"+  "ifStatement{" +
                    ", \n expression=" + expression +
                    "\n}";

        } else if (block != null) {
            return "\nifStatement{" + " block=" + block + "\n}"+  "ifStatement{" +
                    ",  expression=" +  expression +
                    '}';
        }
        return
                "ifStatement{" +
                ",expression =" + expression+
                '}';
    }
}
