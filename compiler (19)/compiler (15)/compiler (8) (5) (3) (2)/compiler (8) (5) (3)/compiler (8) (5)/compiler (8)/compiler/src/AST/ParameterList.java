package AST;

import java.util.List;

public class ParameterList {
    List<Parameter> parameter;

    public List<Parameter> getParameter() {
        return parameter;
    }

    public void setParameter(List<Parameter> parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "\nParameterList{" +
                "\nparameter=" + parameter +
                "\n}";
    }
}
