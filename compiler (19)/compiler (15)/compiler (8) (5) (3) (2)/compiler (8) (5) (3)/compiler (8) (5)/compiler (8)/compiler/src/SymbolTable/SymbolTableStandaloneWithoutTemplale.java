package SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class SymbolTableStandaloneWithoutTemplale {
    private final Map<String, Symbol> symbols = new HashMap<>();
    private static final SymbolTableStandaloneWithoutTemplale instance = new SymbolTableStandaloneWithoutTemplale();

    private SymbolTableStandaloneWithoutTemplale() {}

    public static SymbolTableStandaloneWithoutTemplale getInstance() {
        return instance;
    }

    public void addSymbol(String name, Object value, String type) {
        symbols.put(name, new Symbol(name, String.valueOf(value), type));
    }

    public boolean check(String name) {
        return symbols.containsKey(name);
    }

    // هنا تضيف containsKey
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
        System.out.println("\nStandalone Symbol Table:");
        System.out.println(Symbol.getHeader());
        symbols.values().forEach(System.out::println);
        System.out.println(Symbol.getFooter());
    }




}
