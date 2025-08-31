package AST;


import java.util.List;

public class PostFix_Expression  extends Expression{
Primary primary;
List<PostFixOper> postFixOpers;

    public List<PostFixOper> getPostFixOpers() {
        return postFixOpers;
    }

    public void setPostFixOpers(List<PostFixOper> postFixOpers) {
        this.postFixOpers = postFixOpers;
    }

    public Primary getPrimary() {
        return primary;
    }

    public void setPrimary(Primary primary) {
        this.primary = primary;
    }

    @Override
    public String toString() {
        return "\nPostFix_Expression{" +
                "\npostFixOpers=" + postFixOpers +
                ", \nprimary=" + primary +
                "\n}";
    }
}
