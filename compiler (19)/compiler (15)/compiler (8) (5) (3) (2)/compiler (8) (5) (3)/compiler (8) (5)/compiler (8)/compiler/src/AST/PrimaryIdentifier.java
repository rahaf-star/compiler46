package AST;

public class PrimaryIdentifier implements Primary {
    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "PrimaryIdentifier{identifier='" + identifier + "'}";
    }
}