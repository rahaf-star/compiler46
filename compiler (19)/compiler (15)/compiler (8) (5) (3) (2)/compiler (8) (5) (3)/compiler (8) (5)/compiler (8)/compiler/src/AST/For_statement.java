package AST;

public class For_statement extends ConditionalStatements {
     VariableDeclaration variableDeclaration;
     ExpressionSequence expressionSequence1;
     ExpressionSequence expressionSequence2;
     ExpressionSequence expressionSequence3;
     Block block;

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public ExpressionSequence getExpressionSequence1() {
        return expressionSequence1;
    }

    public void setExpressionSequence1(ExpressionSequence expressionSequence1) {
        this.expressionSequence1 = expressionSequence1;
    }

    public ExpressionSequence getExpressionSequence2() {
        return expressionSequence2;
    }

    public void setExpressionSequence2(ExpressionSequence expressionSequence2) {
        this.expressionSequence2 = expressionSequence2;
    }

    public ExpressionSequence getExpressionSequence3() {
        return expressionSequence3;
    }

    public void setExpressionSequence3(ExpressionSequence expressionSequence3) {
        this.expressionSequence3 = expressionSequence3;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "\nFor_statement{" +
                "\nvariableDeclaration=" + variableDeclaration +
                ", \nexpressionSequence1=" + expressionSequence1 +
                ", \nexpressionSequence2=" + expressionSequence2 +
                ", \nexpressionSequence3=" + expressionSequence3 +
                ", \nblock=" + block +
                "\n}";
    }
}
