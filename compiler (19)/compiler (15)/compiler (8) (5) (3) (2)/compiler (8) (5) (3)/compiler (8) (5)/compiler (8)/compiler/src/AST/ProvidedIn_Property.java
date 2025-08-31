package AST;

public class ProvidedIn_Property extends Injectable_Metadata_Property {
    private final String providedIn;

    public ProvidedIn_Property(String value) {
        this.providedIn = value;
    }

    public String getProvidedIn() {
        return providedIn;
    }
}
