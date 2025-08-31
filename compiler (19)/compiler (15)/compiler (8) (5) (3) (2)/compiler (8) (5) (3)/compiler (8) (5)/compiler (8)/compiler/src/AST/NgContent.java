package AST;

import java.util.ArrayList;
import java.util.List;

public class NgContent extends Html_value {
     List<Html_attribute> attributes = new ArrayList<>();

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
        return "\nNgContent{" +
                "\nattributes=" + attributes +
                "\n}";
    }
}
