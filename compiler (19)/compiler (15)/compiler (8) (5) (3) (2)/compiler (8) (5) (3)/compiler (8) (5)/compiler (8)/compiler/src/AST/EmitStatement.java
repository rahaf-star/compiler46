package AST;

public class EmitStatement extends  Instruction{
JSONObject jsonObject;

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    @Override
    public String toString() {
        return "\nEmitStatement{" +
                "\njsonObject=" + jsonObject +
                "\n}";
    }
}
