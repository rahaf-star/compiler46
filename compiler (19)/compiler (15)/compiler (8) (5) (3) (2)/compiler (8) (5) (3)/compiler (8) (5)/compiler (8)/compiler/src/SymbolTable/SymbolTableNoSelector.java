package SymbolTable;

import SemanticTable.ComponentNoSelectorException;

import java.util.HashMap;
import java.util.Map;

public class SymbolTableNoSelector {

    private static final SymbolTableNoSelector instance = new SymbolTableNoSelector();
    private final Map<String, Symbol> symbols = new HashMap<>();

    private SymbolTableNoSelector() {}

    public static SymbolTableNoSelector getInstance() {
        return instance;
    }

    // 🔹 إضافة مكون بدون selector → ترمي Exception
    public void addSymbol(String componentName, Object metadata, String type) throws ComponentNoSelectorException {
        // إذا المكون موجود مسبقًا → خطأ
        if (symbols.containsKey(componentName)) {
            throw new ComponentNoSelectorException(
                    "Component '" + componentName + "' already registered as NoSelector"
            );
        }

        // إضافة المكون إلى الجدول
        symbols.put(componentName, new Symbol(componentName, "No selector defined", type));

        // مباشرة بعد الإضافة، رمي Exception للكشف عن الخطأ
        throw new ComponentNoSelectorException(
                "Component '" + componentName + "' has no selector defined"
        );
    }

    public void printSymbolTable() {
        System.out.println("\n=== Component NoSelector Table ===");
        if (symbols.isEmpty()) {
            System.out.println("No NoSelector errors detected.");
            return;
        }
        System.out.println(Symbol.getHeader());
        symbols.values().forEach(System.out::println);
        System.out.println(Symbol.getFooter());
    }

    public static class Symbol {
        String name, value, type;
        Symbol(String name, String value, String type) {
            this.name = name; this.value = value; this.type = type;
        }
        public static String getHeader() {
            return "+----------------------------------+--------------------------------------------+--------------+\n" +
                    "| Name                             | Value                                      | Type         |\n" +
                    "+----------------------------------+--------------------------------------------+--------------+";
        }
        public static String getFooter() {
            return "+----------------------------------+--------------------------------------------+--------------+";
        }
        @Override
        public String toString() {
            return String.format("| %-32s | %-42s | %-12s |", name, value, type);
        }
    }
}
