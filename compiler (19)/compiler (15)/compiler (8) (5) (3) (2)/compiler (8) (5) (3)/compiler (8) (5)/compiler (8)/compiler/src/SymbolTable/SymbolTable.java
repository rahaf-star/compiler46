package SymbolTable;

import AST.Array;
import AST.ArrayElement;

import java.util.LinkedHashMap;
import java.util.Map;

public class SymbolTable {
    // جدول الرموز: مخزن رئيسي لتخزين الرموز والبيانات المرتبطة بها.
    private final Map<String, Symbol> table = new LinkedHashMap<>();
    // ✅ Singleton
    private static final SymbolTable instance = new SymbolTable();

    public SymbolTable() {}

    public static SymbolTable getInstance() {
        return instance;
    }

    // إضافة رمز إلى الجدول
    public void addSymbol(String name, Object value, String type) {
        if (name == null || value == null) {
            System.out.println("Cannot add null symbol: " + name);
            return; // لا تضيف الرموز الفارغة
        }

        String formattedValue = formatValue(value); // تنسيق القيمة
        //  System.out.println("Adding symbol: " + name + " -> " + formattedValue); // سجل لتتبع الإضافة

        // إضافة الرمز إلى الجدول
        table.put(name, new Symbol(name, formattedValue, type));
    }

    // التحقق إذا كان الرمز موجودًا في الجدول
    public boolean containsKey(String name) {
        return table.containsKey(name);
    }

    // الحصول على قيمة رمز باستخدام اسمه
    public String getValue(String name) {
        Symbol symbol = table.get(name);
        return (symbol != null) ? symbol.value : null;
    }

    // إرجاع القيمة إذا كانت موجودة، أو قيمة افتراضية إذا لم تكن موجودة
    public String getValueOrDefault(String key, String defaultValue) {
        return containsKey(key) ? getValue(key) : defaultValue;
    }

    // مسح جميع الرموز من الجدول
    public void clear() {
        table.clear();
    }

    // ===== طباعة Symbol Table بشكل مرتب =====
    public void printSymbolTable() {
        if (table.isEmpty()) {
            System.out.println("Symbol table is empty.");
            return;
        }

        int col1 = 32, col2 = 80, col3 = 12; // حجم الأعمدة
        String separator = "+" + "-".repeat(col1 + 2) + "+" + "-".repeat(col2 + 2) + "+" + "-".repeat(col3 + 2) + "+";

        System.out.println("=== Symbol Table ===");
        System.out.println(separator);
        System.out.printf("| %-" + col1 + "s | %-" + col2 + "s | %-" + col3 + "s |%n", "Name", "Value", "Type");
        System.out.println(separator);

        // طباعة الرموز
        for (Symbol s : table.values()) {
            String[] lines = s.value.split("\n");

            // طباعة السطر الأول مع الاسم + النوع
            System.out.printf("| %-" + col1 + "s | %-" + col2 + "s | %-" + col3 + "s |%n",
                    s.name, trimLine(lines[0], col2), s.type);

            // طباعة الأسطر المتبقية للقيمة فقط
            for (int i = 1; i < lines.length; i++) {
                System.out.printf("| %-" + col1 + "s | %-" + col2 + "s | %-" + col3 + "s |%n",
                        "", trimLine(lines[i], col2), "");
            }

            System.out.println(separator);
        }
    }

    // ===== تنسيق القيمة بحيث تكون مناسبة للطباعة =====
    private String formatValue(Object value) {
        if (value == null) return "null"; // إذا كانت القيمة فارغة

        if (value instanceof String) {
            return ((String) value).replace("\r", "").strip(); // إزالة الأسطر الفارغة
        }

        if (value instanceof Array) {
            return formatArray((Array) value); // تنسيق المصفوفات
        }

        return value.toString(); // القيم الأخرى يمكن تحويلها مباشرة إلى نص
    }

    // ===== تنسيق المصفوفات =====
    private String formatArray(Array arr) {
        if (arr == null || arr.getArrayElements() == null || arr.getArrayElements().isEmpty()) return "Array[]";

        StringBuilder sb = new StringBuilder("Array[\n");
        for (ArrayElement elem : arr.getArrayElements()) {
            sb.append("  Element: ");
            if (elem.getExpressions() != null) {
                sb.append(elem.getExpressions().toString().replace("\r", "").replace("\n", " ")).append("\n");
            } else {
                sb.append("null\n");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private String trimLine(String text, int maxLen) {
        if (text == null) return "";
        text = text.replace("\r", "").strip();
        return text; // بدون اقتطاع
    }
    // ===== فئة Symbol =====
    static class Symbol {
        String name;
        String value;
        String type;

        Symbol(String name, String value, String type) {
            this.name = name;
            this.value = value;
            this.type = type;
        }
    }
}
