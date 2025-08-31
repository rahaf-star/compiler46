package AST;

public class Class_Declaration extends Program {

     String identifier;
     Class_Body classBody;



    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Class_Body getClassBody() {
        return classBody;
    }

    public void setClassBody(Class_Body classBody) {
        this.classBody = classBody;
    }


    @Override
    public String toString() {
        return "\nClass_Declaration{" +
                "\nidentifier='" + identifier + '\'' +
                ", \nclassBody=" + classBody +
                "\n}";
    }
}
