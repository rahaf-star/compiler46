package AST;

import java.util.ArrayList;
import java.util.List;

public class ExpressionSequence {
     List<Value> values = new ArrayList<Value>();
     String identifier; // used if the second alternative is matched

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public void addValue(Value value) {
        this.values.add(value);
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        if (identifier != null) {
            return "\nExpressionSequence{identifier='" + identifier + "'}";
        } else {
            return "\nExpressionSequence{values=" + values + "}";
        }
    }
}
