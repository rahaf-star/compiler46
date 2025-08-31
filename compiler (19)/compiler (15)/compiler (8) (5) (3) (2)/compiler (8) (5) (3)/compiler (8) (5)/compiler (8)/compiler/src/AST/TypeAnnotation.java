package AST;

import java.util.ArrayList;
import java.util.List;

public class TypeAnnotation {
    List<BaseTypeAnnotation> baseTypeAnnotation= new ArrayList<>();

    public List<BaseTypeAnnotation> getBaseTypeAnnotation() {
        return baseTypeAnnotation;
    }

    public void setBaseTypeAnnotation(List<BaseTypeAnnotation> baseTypeAnnotation) {
        this.baseTypeAnnotation = baseTypeAnnotation;
    }


    @Override
    public String toString() {
        return "\nTypeAnnotation{" +
                "\nbaseTypeAnnotation=" + baseTypeAnnotation +
                "\n}";
    }
}
