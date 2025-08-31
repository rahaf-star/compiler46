package AST;

import java.util.ArrayList;
import java.util.List;

public class Array extends Value implements   Primary {
List<ArrayElement> arrayElements;

    public List<ArrayElement> getArrayElements() {
        return arrayElements;
    }

    public void setArrayElements(List<ArrayElement> arrayElements) {
        this.arrayElements = arrayElements;
    }

    @Override
    public String toString() {
        return "\nArray{" +
                "\narrayElements=" + arrayElements +
                "\n}";
    }
}
