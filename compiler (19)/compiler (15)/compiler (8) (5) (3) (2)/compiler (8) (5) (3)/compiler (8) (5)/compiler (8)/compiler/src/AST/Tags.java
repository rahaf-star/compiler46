package AST;

public class Tags {
     String tagName;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "\nTags{" +
                "\ntagName='" + tagName + '\'' +
                "\n}";
    }
}
