package AST;

import java.util.ArrayList;
import java.util.List;

public class Switch_body {
     List<Switch_case> cases = new ArrayList<>();
     Switch_default defaultCase; // optional, only one default allowed

    public List<Switch_case> getCases() {
        return cases;
    }

    public void setCases(List<Switch_case> cases) {
        this.cases = cases;
    }

    public void addCase(Switch_case switchCase) {
        this.cases.add(switchCase);
    }

    public Switch_default getDefaultCase() {
        return defaultCase;
    }

    public void setDefaultCase(Switch_default defaultCase) {
        this.defaultCase = defaultCase;
    }

    @Override
    public String toString() {
        return "\nSwitch_body{" +
                "\ncases=" + cases +
                ", \ndefaultCase=" + defaultCase +
                "\n}";
    }
}
