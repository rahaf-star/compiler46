package AST;



public class Selector_Property extends Metadata_Property {
    private final String selector;

    public Selector_Property(String selector) {
        super("selector");
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    @Override
    public String getValueAsString() {
        return selector;
    }

    @Override
    public String toString() {
        return "\nSelector_Property{" +
                "\nselector='" + selector + '\'' +
                "\n}";
    }
}