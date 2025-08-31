package AST;

import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag extends Html_value {
     String tagName; // the identifier or tag
     List<Html_attribute> attributes = new ArrayList<Html_attribute>();

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<Html_attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Html_attribute> attributes) {
        this.attributes = attributes;
    }

    public void addAttribute(Html_attribute attr) {
        this.attributes.add(attr);
    }

    @Override
    public String toString() {
        return "\nSelfClosingTag{" +
                "\ntagName='" + tagName + '\'' +
                ", \nattributes=" + attributes +
                "\n}";
    }
}
