package AST;

import AST.Metadata_Property;

public class Standalone_Property extends Metadata_Property {
    private final boolean isStandalone;
    boolean value;

    public Standalone_Property(boolean isStandalone) {
        super("standalone");
        this.isStandalone = isStandalone;
    }
    public boolean isStandalone() {
        return isStandalone;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }


    @Override
    public String getValueAsString() {
        return Boolean.toString(isStandalone);
    }

    @Override
    public String toString() {
        return "\nMetadata_Standalone{" +
                "\nvalue=" + value +
                "\n}";
    }
}


