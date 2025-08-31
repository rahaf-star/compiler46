package AST;


public class DeclarationKeyword {
     String keyword;

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    @Override
    public String toString() {
        return "\nDeclarationKeyword{" +
                "\nkeyword='" + keyword + '\'' +
                "\n}";
    }
}
