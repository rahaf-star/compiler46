package AST;

import java.util.ArrayList;
import java.util.List;

public abstract class Program {

    private List<Anguler_Import> anguler_importList = new ArrayList<>();
    private List<Component_Declaration> component_declarationList = new ArrayList<>();
    private List<Injectable_Declaration> injectable_declarationList = new ArrayList<>();
    private List<Export_Statement> export_statementList = new ArrayList<>();
    private List<Class_Declaration> class_declarationList = new ArrayList<>();

    // Getters & Setters
    public List<Anguler_Import> getAnguler_importList() {
        return anguler_importList;
    }

    public void setAnguler_importList(List<Anguler_Import> anguler_importList) {
        this.anguler_importList = anguler_importList;
    }

    public List<Component_Declaration> getComponent_declarationList() {
        return component_declarationList;
    }

    public void setComponent_declarationList(List<Component_Declaration> component_declarationList) {
        this.component_declarationList = component_declarationList;
    }

    public List<Injectable_Declaration> getInjectable_declarationList() {
        return injectable_declarationList;
    }

    public void setInjectable_declarationList(List<Injectable_Declaration> injectable_declarationList) {
        this.injectable_declarationList = injectable_declarationList;
    }

    public List<Export_Statement> getExport_statementList() {
        return export_statementList;
    }

    public void setExport_statementList(List<Export_Statement> export_statementList) {
        this.export_statementList = export_statementList;
    }

    public List<Class_Declaration> getClass_declarationList() {
        return class_declarationList;
    }

    public void setClass_declarationList(List<Class_Declaration> class_declarationList) {
        this.class_declarationList = class_declarationList;
    }

    @Override
    public String toString() {
        return "Program {" +
                "\n  anguler_importList=" + anguler_importList +
                ",\n  component_declarationList=" + component_declarationList +
                ",\n  injectable_declarationList=" + injectable_declarationList +
                ",\n  export_statementList=" + export_statementList +
                ",\n  class_declarationList=" + class_declarationList +
                "\n}";
    }
}
