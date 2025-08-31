package AST;

import java.util.List;

public class NestedHtml extends Html_value {
    private List<Html_value> children;

    public List<Html_value> getChildren() {
        return children;
    }

    public void setChildren(List<Html_value> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "\nNestedHtml{" +
                "\nchildren=" + children +
                "\n}";
    }
}
