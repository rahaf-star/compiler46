package AST;

public class Continue_statement extends ConditionalStatements {
     String label; // optional IDENTIFIER

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "\nContinue_statement{" +
                "\nlabel='" + label + '\'' +
                "\n}";
    }
}
