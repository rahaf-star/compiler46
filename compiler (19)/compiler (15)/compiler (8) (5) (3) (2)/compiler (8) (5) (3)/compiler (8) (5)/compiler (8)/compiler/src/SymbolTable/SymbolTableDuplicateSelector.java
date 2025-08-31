package SymbolTable;

import SemanticTable.DuplicateSelectorException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTableDuplicateSelector {


    private static final SymbolTableDuplicateSelector instance = new SymbolTableDuplicateSelector();
    private final Map<String, List<Symbol>> symbols = new HashMap<>();

    private SymbolTableDuplicateSelector() {}

    public static SymbolTableDuplicateSelector getInstance() {
        return instance;
    }

    /**
     * إضافة Symbol.
     * @throws DuplicateSelectorException إذا كان هناك تكرار.
     */
    public void addSymbol(String name, Object value, String type) throws DuplicateSelectorException {
        Symbol newSymbol = new Symbol(name, String.valueOf(value), type);

        if (symbols.containsKey(name)) {
            List<Symbol> existingSymbols = symbols.get(name);
            for (Symbol symbol : existingSymbols) {
                if (symbol.getValue().equals(newSymbol.getValue())) {

                    throw new DuplicateSelectorException(
                            "Duplicate selector '" + name + "' already exists with value '" + symbol.getValue() + "'"
                    );
                }
            }
        }

        symbols.computeIfAbsent(name, k -> new ArrayList<>()).add(newSymbol);
    }
    public boolean containsKey(String name) {
        return symbols.containsKey(name);
    }

    public Symbol getSymbol(String name) {
        List<Symbol> list = symbols.get(name);
        return (list != null && !list.isEmpty()) ? list.get(0) : null;
    }

    public String getValue(String name) {
        Symbol symbol = getSymbol(name);
        return (symbol != null) ? String.valueOf(symbol.getValue()) : null;
    }


    public void printSymbolTable() {
        System.out.println("\n=== Duplicate Selector Table ===");
        System.out.println(Symbol.getHeader());
        for (List<Symbol> list : symbols.values()) {
            for (Symbol s : list) {
                System.out.println(s);
            }
        }
        System.out.println(Symbol.getFooter());
    }
    public void clear() {
        symbols.clear();
    }
}
