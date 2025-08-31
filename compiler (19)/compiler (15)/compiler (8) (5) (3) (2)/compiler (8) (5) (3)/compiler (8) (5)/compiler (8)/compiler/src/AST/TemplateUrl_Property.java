package AST;

public class TemplateUrl_Property extends Metadata_Property {
    String templateUrl;

    public TemplateUrl_Property(String name) {
        super(name);
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    private String cleanUrlString(String url) {
        // إزالة علامات الاقتباس حول النص إذا كانت موجودة
        return url.replaceAll("^[\"']|[\"']$", "");
    }

    public String getTemplateUrl() {
        return templateUrl;
    }

    @Override
    public String getValueAsString() {
        return templateUrl != null ? cleanUrlString(templateUrl) : null;
    }

    @Override
    public String toString() {
        return "\nTemplateUrl_Property{" +
                "\ntemplateUrl='" + templateUrl + '\'' +
                "\n}";
    }
}
