package SymbolTable;

import AST.LiteralValue;
import AST.Value;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Symbol implements List<SymbolTable.Symbol> {
    private String name;
    private Object value;
    private String type;

    private static final int MAX_NAME_LENGTH = 25;
    private static final int MAX_VALUE_LENGTH = 60;
    private static final int MAX_TYPE_LENGTH = 20;

    public Symbol(String name, Object value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    // Getters
    public String getName() { return name; }
    public Object getValue() { return value; }
    public String getType() { return type; }

    // Setter
    public void setValue(Object value) { this.value = value; }

    // ملخص القيمة للعرض داخل الجدول
    private String getSummary() {
        if (value == null) return "";

        if (value instanceof LiteralValue) {
            return truncate(value.toString(), MAX_VALUE_LENGTH); // استخدمنا toString() هنا
        }

        if (value instanceof Value) {
            return truncate(value.toString(), MAX_VALUE_LENGTH);
        }

        return truncate(value.toString(), MAX_VALUE_LENGTH);
    }

    // عرض كامل للقيمة
    public String getFullValue() {
        if (value == null) return "";

        if (value instanceof LiteralValue) {
            return value.toString(); // استخدمنا toString() هنا أيضًا
        }

        if (value instanceof Value) {
            return value.toString();
        }

        return value.toString();
    }

    // تقصير النص مع "..."
    private String truncate(String str, int maxLength) {
        if (str == null) return "";
        return str.length() > maxLength ? str.substring(0, maxLength - 3) + "..." : str;
    }

    // طباعة مختصرة للعرض في الجدول
    @Override
    public String toString() {
        String format = "| %-" + MAX_NAME_LENGTH + "s | %-" + MAX_VALUE_LENGTH + "s | %-" + MAX_TYPE_LENGTH + "s |";
        return String.format(format,
                truncate(name, MAX_NAME_LENGTH),
                getSummary(),
                truncate(type, MAX_TYPE_LENGTH));
    }

    public static String getHeader() {
        String line = "+---------------------------+--------------------------------------------------------------+----------------------+";
        String header = String.format("| %-25s | %-62s | %-20s |", "Name", "Value", "Type");
        return line + "\n" + header + "\n" + line;
    }

    public static String getFooter() {
        return "+---------------------------+--------------------------------------------------------------+----------------------+";
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<SymbolTable.Symbol> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(SymbolTable.Symbol symbol) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends SymbolTable.Symbol> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends SymbolTable.Symbol> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public SymbolTable.Symbol get(int index) {
        return null;
    }

    @Override
    public SymbolTable.Symbol set(int index, SymbolTable.Symbol element) {
        return null;
    }

    @Override
    public void add(int index, SymbolTable.Symbol element) {

    }

    @Override
    public SymbolTable.Symbol remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<SymbolTable.Symbol> listIterator() {
        return null;
    }

    @Override
    public ListIterator<SymbolTable.Symbol> listIterator(int index) {
        return null;
    }

    @Override
    public List<SymbolTable.Symbol> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
