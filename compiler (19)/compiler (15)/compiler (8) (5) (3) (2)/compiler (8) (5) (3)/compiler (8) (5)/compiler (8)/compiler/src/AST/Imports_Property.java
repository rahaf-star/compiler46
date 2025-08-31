package AST;

public class Imports_Property extends Metadata_Property {
    private Imports_Array imports;
    private String binding;

    // Constructor يمرر قيمة للـ superclass
    public Imports_Property(String metadataName) {
        super(metadataName); // تمرير String إلى Metadata_Property
    }

    // Constructor إضافي لإنشاء Imports_Property مع binding
    public Imports_Property(String metadataName, String binding) {
        super(metadataName);
        this.binding = binding;
    }

    // Constructor إضافي لإنشاء Imports_Property مع imports array
    public Imports_Property(String metadataName, Imports_Array imports) {
        super(metadataName);
        this.imports = imports;
    }

    public boolean isBinding() {
        return binding != null;
    }

    public boolean hasImportsArray() {
        return imports != null;
    }

    public Imports_Array getImports() {
        if (!hasImportsArray()) {
            throw new IllegalStateException("No imports array present");
        }
        return imports;
    }

    public String getBinding() {
        if (!isBinding()) {
            throw new IllegalStateException("No binding present");
        }
        return binding;
    }

    @Override
    public String toString() {
        return "\nImports_Property{" +
                "\nimports=" + (imports != null ? imports : "null") +
                ", \nbinding='" + (binding != null ? binding : "null") + '\'' +
                "\n}";
    }

    @Override
    public String getValueAsString() {
        return "";
    }
}
