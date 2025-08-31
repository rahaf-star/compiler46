package AST;

public class TemplateVariable extends Html_value {
     String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nTemplateVariable{" +
                "\nname='" + name + '\'' +
                "\n}";
    }
}
