package AST;

public class Close_tag {
     String tagName; // either tags or IDENTIFIER

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "\nClose_tag{" +
                "\ntagName='" + tagName + '\'' +
                "\n}";
    }
}
