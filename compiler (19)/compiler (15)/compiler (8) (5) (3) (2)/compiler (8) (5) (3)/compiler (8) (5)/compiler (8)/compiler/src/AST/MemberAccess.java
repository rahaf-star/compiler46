package AST;

import java.util.List;

public class MemberAccess extends PostFixOper {
    private String memberName;
    private List<Expression> arguments;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public void setArguments(List<Expression> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "MemberAccess{memberName='" + memberName + "', arguments=" + arguments + "}";
    }
}
