package AST;

public class Interface_Declaration extends Instruction {
    String interfaceName;
    StructuredType structuredType;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public StructuredType getStructuredType() {
        return structuredType;
    }

    public void setStructuredType(StructuredType structuredType) {
        this.structuredType = structuredType;
    }

    @Override
    public String toString() {
        return "\nInterface{" +
                "\ninterfaceName='" + interfaceName + '\'' +
                ", \nstructuredType=" + structuredType +
                "\n}";
    }
}
