package AST;

import java.util.ArrayList;
import java.util.List;

public class NgTemplate extends Html_value {
     List<Html_attribute> attributes = new ArrayList<Html_attribute>();
     List<Html_value> children = new ArrayList<>(); // only for the content version

    public List<Html_attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Html_attribute> attributes) {
        this.attributes = attributes;
    }

    public void addAttribute(Html_attribute attr) {
        this.attributes.add(attr);
    }

    public List<Html_value> getChildren() {
        return children;
    }

    public void setChildren(List<Html_value> children) {
        this.children = children;
    }

    public void addChild(Html_value child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        return "\nNgTemplate{" +
                "\nattributes=" + attributes +
                ", \nchildren=" + children +
                "\n}";
    }
}
