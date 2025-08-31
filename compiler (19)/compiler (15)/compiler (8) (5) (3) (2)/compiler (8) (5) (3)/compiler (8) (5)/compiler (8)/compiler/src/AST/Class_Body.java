package AST;

import java.util.ArrayList;
import java.util.List;

public class Class_Body {
    private List<PropertyDeclaration> properties ;
    private List<MethodDeclaration> methods ;
    private List<Function_Declaration> functions ;
    private List<Class_Declaration> classes ;
    private List<Instruction> instructions ;

    public List<PropertyDeclaration> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyDeclaration> properties) {
        this.properties = properties;
    }

    public List<MethodDeclaration> getMethods() {
        return methods;
    }

    public void setMethods(List<MethodDeclaration> methods) {
        this.methods = methods;
    }

    public List<Function_Declaration> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function_Declaration> functions) {
        this.functions = functions;
    }

    public List<Class_Declaration> getClasses() {
        return classes;
    }

    public void setClasses(List<Class_Declaration> classes) {
        this.classes = classes;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "\nClass_Body{" +
                "\nclasses=" + classes +
                ", \nproperties=" + properties +
                ", \nmethods=" + methods +
                ", \nfunctions=" + functions +
                ", \ninstructions=" + instructions +
                "\n}";
    }
}
