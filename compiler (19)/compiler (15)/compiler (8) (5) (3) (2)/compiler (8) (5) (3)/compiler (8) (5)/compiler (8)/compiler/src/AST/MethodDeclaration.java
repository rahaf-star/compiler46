package AST;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclaration {
    String accessModifier;
    TypeAnnotation typeAnnotation;
    ParameterList parameters;
    MethodBody methodBody;
    String methodName;

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
    // Change getter/setter for parameters
    public ParameterList getParameters() {
        return parameters;
    }

    public void setParameters(ParameterList parameters) {
        this.parameters = parameters;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public MethodBody getMethodBody() {
        return methodBody;
    }

    public void setMethodBody(MethodBody methodBody) {
        this.methodBody = methodBody;
    }

    @Override
    public String toString() {
        return "MethodDeclaration{" +
                "accessModifier='" + accessModifier + '\'' +
                ", typeAnnotation=" + typeAnnotation +
                ", parameters=" + parameters +
                ", methodBody=" + methodBody +
                '}';
    }
}