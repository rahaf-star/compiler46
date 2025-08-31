package AST;

import java.util.ArrayList;
import java.util.List;

/**
 * AST class for the 'imports_array' rule:
 * imports_array : OPEN_BRACKET (value (COMMA value)*)? CLOSE_BRACKET ;
 */
public class Imports_Array {
    List<Value> values = new ArrayList<>();


    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }


    @Override
    public String toString() {
        return "Imports_Array{" +
                "values=" + values +
                '}';
    }
}