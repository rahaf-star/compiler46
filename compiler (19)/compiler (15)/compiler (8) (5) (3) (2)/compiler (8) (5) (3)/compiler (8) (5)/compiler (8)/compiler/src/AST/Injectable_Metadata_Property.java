package AST;

public class Injectable_Metadata_Property {
    private String propertyName;
    private String propertyValue;

    public Injectable_Metadata_Property() {
    }

    public Injectable_Metadata_Property(String propertyName, String propertyValue) {
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    public String getPropertyName() { return propertyName; }
    public void setPropertyName(String propertyName) { this.propertyName = propertyName; }

    public String getPropertyValue() { return propertyValue; }
    public void setPropertyValue(String propertyValue) { this.propertyValue = propertyValue; }

    @Override
    public String toString() {
        return "\nInjectable_Metadata_Property{" +
                "\npropertyName='" + propertyName + '\'' +
                ", \npropertyValue='" + propertyValue + '\'' +
                "\n}";
    }
}
