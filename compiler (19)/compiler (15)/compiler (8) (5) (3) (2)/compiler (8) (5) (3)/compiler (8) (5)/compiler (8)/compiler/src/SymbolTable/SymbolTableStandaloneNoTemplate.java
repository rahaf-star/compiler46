package SymbolTable;

import SemanticTable.StandaloneWithoutTemplateException;

import java.util.HashMap;
import java.util.Map;

public class SymbolTableStandaloneNoTemplate {

    private static final SymbolTableStandaloneNoTemplate instance = new SymbolTableStandaloneNoTemplate();
    private final Map<String, Symbol> symbols = new HashMap<>();

    private SymbolTableStandaloneNoTemplate() {}

    public static SymbolTableStandaloneNoTemplate getInstance() {
        return instance;
    }

    // 🔹 إضافة مكون Standalone بدون template → ترمي Exception
    public void addSymbol(String componentName, Object metadata, String type) throws StandaloneWithoutTemplateException {
        if (symbols.containsKey(componentName)) {
            throw new StandaloneWithoutTemplateException(
                    "Standalone component '" + componentName + "' already registered as NoTemplate"
            );
        }

        symbols.put(componentName, new Symbol(componentName, "No template or templateUrl defined", type));

        // مباشرة بعد الإضافة، رمي Exception للكشف عن الخطأ
        throw new StandaloneWithoutTemplateException(
                "Standalone component '" + componentName + "' must have a template or templateUrl"
        );
    }

    public void printSymbolTable() {
        System.out.println("\n=== Standalone NoTemplate Table ===");
        if (symbols.isEmpty()) {
            System.out.println("No StandaloneWithoutTemplate errors detected.");
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
