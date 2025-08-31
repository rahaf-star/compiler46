package AST;

import java.util.ArrayList;
import java.util.List;

public class Injectable_Metadata {
    private List<Injectable_Metadata_Property> properties = new ArrayList<>();
    private final List<String> semanticErrors = new ArrayList<>();
    public String providedIn; // أو أي اسم مشابه

    public List<Injectable_Metadata_Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Injectable_Metadata_Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Injectable_Metadata_Property property) {
        if (property != null) {
            this.properties.add(property);
        }
    }

    public void addSemanticError(String error) {
        semanticErrors.add(error);
    }

    public List<String> getSemanticErrors() {
        return semanticErrors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Injectable_Metadata{ ");

        boolean hasProvidedIn = false;

        if (properties != null && !properties.isEmpty()) {
            for (Injectable_Metadata_Property prop : properties) {
                if (prop instanceof ProvidedIn_Property) {
                    ProvidedIn_Property p = (ProvidedIn_Property) prop;
                    sb.append("providedIn = '").append(p.getProvidedIn()).append("'; ");
                    hasProvidedIn = true;
                }
            }
        }

        if (!hasProvidedIn) {
            sb.append("providedIn = null; ");
        }

        sb.append("}");
        return sb.toString();
    }
}
