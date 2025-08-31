package AST;

public class StyleUrls_Property extends Metadata_Property {
    private Imports_Array styleUrls;

    // ✅ Constructor افتراضي يمرر اسم الميتاداتا للـ super
    public StyleUrls_Property() {
        super("styleUrls");
    }

    public Imports_Array getStyleUrls() {
        return styleUrls;
    }

    public void setStyleUrls(Imports_Array styleUrls) {
        this.styleUrls = styleUrls;
    }

    @Override
    public String getValueAsString() {
        // ترجمة القيمة كسلسلة نصية
        return styleUrls != null ? styleUrls.toString() : "";
    }

    @Override
    public String toString() {
        return "\nStyleUrls_Property{" +
                "\nstyleUrls=" + styleUrls +
                "\n}";
    }
}
