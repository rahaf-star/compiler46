package AST;

import java.util.List;

public class Generic_Type {
    String id;
    List<TypeAnnotation> typeAnnotations;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<TypeAnnotation> getTypeAnnotations() {
        return typeAnnotations;
    }

    public void setTypeAnnotations(List<TypeAnnotation> typeAnnotations) {
        this.typeAnnotations = typeAnnotations;
    }

    @Override
    public String toString() {
        return "\nGeneric_Type{" +
                "\nid='" + id + '\'' +
                ",\n typeAnnotations=" + typeAnnotations +
               "\n}";
    }
}
