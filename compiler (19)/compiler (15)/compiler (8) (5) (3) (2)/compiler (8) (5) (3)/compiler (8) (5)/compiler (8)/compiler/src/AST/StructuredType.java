package AST;

import java.util.ArrayList;
import java.util.List;

public class StructuredType extends BaseTypeAnnotation{
    List<TypePair> typePair= new ArrayList<>();


    public List<TypePair> getTypePair() {
        return typePair;
    }

    public void setTypePair(List<TypePair> typePair) {
        this.typePair = typePair;
    }

    @Override
    public String toString() {
        return "\nStructuredType{" +
                "\ntypePair=" + typePair +
                "\n}";
    }
}
