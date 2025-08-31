package AST;

import java.util.*;

public class JSONObject extends Value implements Primary {
    List<JsonPair> jsonPair; // No initialization here

    public List<JsonPair> getJsonPair() {
        if (jsonPair == null) {
            jsonPair = new ArrayList<>(); // ✅ Initialize on first access
        }
        return jsonPair;
    }

    public void setJsonPair(List<JsonPair> jsonPair) {
        this.jsonPair = jsonPair;
    }

    @Override
    public String toString() {
        return "\nJSONObject  {" + "jsonPair=" + getJsonPair() + "\n}";
    }
}