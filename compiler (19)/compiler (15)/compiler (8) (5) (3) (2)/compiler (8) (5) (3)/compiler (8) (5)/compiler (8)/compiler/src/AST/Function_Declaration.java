package AST;

public class Function_Declaration extends Instruction {
    private String identifier;
    private FunctionBody functionBody;



    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }



    @Override
    public String toString() {
        return "\nFunction_Declaration{" +
                "\nidentifier='" + identifier + '\'' +
                ", \nfunctionBody=" + functionBody +
                "\n}";
    }
}
