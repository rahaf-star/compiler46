package AST;

public class Export_Statement extends Program {

    VariableDeclaration variableDeclaration;
    MethodDeclaration methodDeclaration;
    Function_Declaration functionDeclaration;
    Interface_Declaration interfaceDeclaration;

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    public Function_Declaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(Function_Declaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public Interface_Declaration getInterfaceDeclaration() {
        return interfaceDeclaration;
    }

    public void setInterfaceDeclaration(Interface_Declaration interfaceDeclaration) {
        this.interfaceDeclaration = interfaceDeclaration;
    }

    @Override
    public String toString() {
        return "Export_Statement {" +
                "\n  variableDeclaration=" + variableDeclaration +
                ",\n  methodDeclaration=" + methodDeclaration +
                ",\n  functionDeclaration=" + functionDeclaration +
                ",\n  interfaceDeclaration=" + interfaceDeclaration +
                "\n}";
    }
}
