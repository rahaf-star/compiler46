package AST;

public class Styles_Property extends Metadata_Property {
    String style;
    Array styleArray;

    // public Styles_Property(String selector) {
    //     super(selector);
    // }
    public Styles_Property() {
        super("");
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Array getStyleArray() {
        return styleArray;
    }

    public void setStyleArray(Array styleArray) {
        this.styleArray = styleArray;
    }

    @Override
    public String toString() {
        return "Styles_Property{" +
                "style='" + style + '\'' +
                ", styleArray=" + styleArray +
                '}';
    }

    @Override
    public String getValueAsString() {
        return "";
    }
}