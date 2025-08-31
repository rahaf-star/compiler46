package SemanticTable;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    public static List<String> errors = new ArrayList<>();
    public static List<String> getErrors() {
        return errors;
    }

    public static void logError(Exception e, int line, int column) {
        String errorMsg = "Error at line " + line + ", column " + column + ": " + e.getMessage();
        errors.add(errorMsg);
    }

    public static void writeErrorsToFile() {
        try (FileWriter writer = new FileWriter("Result/SemanticError.txt")) {
            writer.write("Semantic Error Report:\n\n");
            for (String error : errors) {
                writer.write(error + "\n");
            }
            writer.write("\nTotal errors: " + errors.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printAllErrors() {
        if (errors.isEmpty()) {
            System.out.println("No semantic errors found.");
            return;
        }

        System.out.println("\nSemantic Errors Found:");
        errors.forEach(System.out::println);
        System.out.println("Total errors: " + errors.size());
    }
}