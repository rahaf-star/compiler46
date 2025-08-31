package AST;

public class Injectable_Declaration extends Program{

    Injectable_Metadata injectableMetadata;
    Class_Declaration classDeclaration;



    public Injectable_Metadata getInjectableMetadata() {
        return injectableMetadata;
    }

    public void setInjectableMetadata(Injectable_Metadata injectableMetadata) {
        this.injectableMetadata = injectableMetadata;
    }

    public Class_Declaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(Class_Declaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        return "Injectable_Declaration {" +
                "\n  injectableMetadata=" + injectableMetadata +
                ",\n  classDeclaration=" + classDeclaration +
                "\n}";
    }
}
