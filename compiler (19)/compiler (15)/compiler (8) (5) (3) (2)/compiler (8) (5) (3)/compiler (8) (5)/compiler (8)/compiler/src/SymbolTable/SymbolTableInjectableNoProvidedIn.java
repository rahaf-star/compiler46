package SymbolTable;

import AST.Injectable_Metadata;
import AST.Injectable_Metadata_Property;
import AST.ProvidedIn_Property;
import SemanticTable.InjectableNoProvidedInException;

import java.util.HashMap;
import java.util.Map;

public class SymbolTableInjectableNoProvidedIn {
    private final Map<String, Symbol> symbols = new HashMap<>();
    private static final SymbolTableInjectableNoProvidedIn instance = new SymbolTableInjectableNoProvidedIn();

    private SymbolTableInjectableNoProvidedIn() {}

    public static SymbolTableInjectableNoProvidedIn getInstance() {
        return instance;
    }

    /**
     * إضافة Injectable إلى الجدول.
     * @throws InjectableNoProvidedInException إذا providedIn مفقود أو فاضي.
     */
    public void addSymbol(String name, Object value, String type) throws InjectableNoProvidedInException {
        if (value instanceof Injectable_Metadata) {
            Injectable_Metadata metadata = (Injectable_Metadata) value;

            boolean hasProvidedIn = false;
            if (metadata.getProperties() != null) {
                for (Injectable_Metadata_Property prop : metadata.getProperties()) {
                    if (prop instanceof ProvidedIn_Property) {
                        hasProvidedIn = true;
                        break;
                    }
                }
            }

            if (!hasProvidedIn) {
                metadata.addSemanticError("Injectable '" + name + "' does not specify providedIn");
                symbols.put(name, new Symbol(name, String.valueOf(metadata), "InjectableError"));
                throw new InjectableNoProvidedInException(
                        "Injectable '" + name + "' does not specify providedIn"
                );
            }
        }

        // إذا موجود providedIn، أضفه كـ Injectable
        symbols.put(name, new Symbol(name, String.valueOf(value), type));
    }
    public boolean check(String name) {
        return symbols.containsKey(name);
    }

    public boolean containsKey(String name) {
        return symbols.containsKey(name);
    }

    public Symbol getSymbol(String name) {
        return symbols.get(name);
    }

    public String getValue(String name) {
        Symbol symbol = symbols.get(name);
        return (symbol != null) ? String.valueOf(symbol.getValue()) : null;
    }

    public void printSymbolTable() {
        System.out.println("\n=== Injectable Without providedIn Table ===");
        System.out.println(Symbol.getHeader());
        symbols.values().forEach(System.out::println);
        System.out.println(Symbol.getFooter());
    }
}
