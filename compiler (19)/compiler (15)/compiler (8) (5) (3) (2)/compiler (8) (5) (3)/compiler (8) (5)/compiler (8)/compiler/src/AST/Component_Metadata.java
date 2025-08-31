package AST;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public  class Component_Metadata {
    private List<Metadata_Property> properties = new ArrayList<>();

    public List<Metadata_Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Metadata_Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Metadata_Property property) {
        this.properties.add(property);
    }

    @Override
    public String toString() {
        return "Component_Metadata{" +
                "properties=" + properties +
                '}';
    }
}
