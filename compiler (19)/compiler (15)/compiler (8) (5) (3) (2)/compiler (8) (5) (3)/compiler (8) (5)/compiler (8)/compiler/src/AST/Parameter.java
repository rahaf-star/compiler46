package AST;

public class Parameter {
 String identifier;
BaseTypeAnnotation baseTypeAnnotation;
StructuredType structuredType;

    public  String getIdentifier() {
        return identifier;
    }

    public void setIdentifier( String identifier) {
        this.identifier = identifier;
    }

    public BaseTypeAnnotation getBaseTypeAnnotation() {
        return baseTypeAnnotation;
    }

    public void setBaseTypeAnnotation(BaseTypeAnnotation baseTypeAnnotation) {
        this.baseTypeAnnotation = baseTypeAnnotation;
    }

    public StructuredType getStructuredType() {
        return structuredType;
    }

    public void setStructuredType(StructuredType structuredType) {
        this.structuredType = structuredType;
    }

    @Override
    public String toString() {
         if (baseTypeAnnotation != null) {
            return "\nParameter {" + " baseTypeAnnotation=" + baseTypeAnnotation + "\n}"+ "\nParameter{" +
                    "\nidentifier=" + identifier +"\n";

        } else if (structuredType != null) {
            return "\nParameter{" + " structuredType=" + structuredType + "\n}"+ "\nParameter{" +
                    "\nidentifier=" + identifier +"\n";
        }
           return   "\nParameter{" +
                   "\nidentifier=" + identifier +"\n";
    }
}
