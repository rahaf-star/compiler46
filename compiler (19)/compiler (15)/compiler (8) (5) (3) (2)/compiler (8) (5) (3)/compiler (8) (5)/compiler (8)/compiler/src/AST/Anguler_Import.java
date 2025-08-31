package AST;

public class Anguler_Import {
    private String identifir;
    private String literal;

    public Anguler_Import() {}

    public Anguler_Import(String identifir, String literal) {
        this.identifir = identifir;
        this.literal = literal;
    }

    public String getIdentifir() {
        return identifir;
    }

    public void setIdentifir(String identifir) {
        this.identifir = identifir;
    }

    public String getLiteral() {
        return literal;
    }

    public void setLiteral(String literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        return "\nAnguler_Import{" +
                "\nidentifir='" + identifir + '\'' +
                ", \nliteral='" + literal + '\'' +
                "\n}";
    }
}
