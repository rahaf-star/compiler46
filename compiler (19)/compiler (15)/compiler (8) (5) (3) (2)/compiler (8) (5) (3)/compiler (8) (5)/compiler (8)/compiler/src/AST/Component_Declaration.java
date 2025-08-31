package AST;

public abstract class Component_Declaration extends Program{
    Component_Metadata metadata;
    Class_Declaration classDecl;

    public Component_Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Component_Metadata metadata) {
        this.metadata = metadata;
    }

    public Class_Declaration getClassDecl() {
        return classDecl;
    }

    public void setClassDecl(Class_Declaration classDecl) {
        this.classDecl = classDecl;
    }

    @Override
    public String toString() {
        return "\nComponent{" +
                "\nmetadata = " + metadata +
                ", \nclassDecl=" + classDecl +
                "\n}";
    }
}
