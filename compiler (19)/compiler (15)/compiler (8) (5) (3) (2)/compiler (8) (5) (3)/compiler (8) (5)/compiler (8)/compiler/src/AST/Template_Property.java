package AST;

public class Template_Property extends Metadata_Property {

    private String templateContent;   // النص الأصلي للقالب
    private String cleanedContent;    // النص بعد تنظيف الـ backticks

    public Template_Property(String name) {
        super(name);
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        this.cleanedContent = cleanTemplateLiteral(templateContent);
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public String getCleanedContent() {
        return cleanedContent;
    }

    private String cleanTemplateLiteral(String raw) {
        if (raw.startsWith("`") && raw.endsWith("`")) {
            return raw.substring(1, raw.length() - 1);
        }
        return raw;
    }

    @Override
    public String getValueAsString() {
        return cleanedContent;
    }

    @Override
    public String toString() {
        return "Template_Property{" +
                "templateContent='" + templateContent + '\'' +
                ", cleanedContent='" + cleanedContent + '\'' +
                '}';
    }
}
