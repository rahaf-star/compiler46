package AST;

import java.util.ArrayList;
import java.util.List;

public class Switch_case {
     Value value;
     List<Instruction> instructions = new ArrayList<Instruction>();

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public void addInstruction(Instruction instruction) {
        this.instructions.add(instruction);
    }

    @Override
    public String toString() {
        return "\nSwitch_case{" +
                "\nvalue=" + value +
                ", \ninstructions=" + instructions +
                "\n}";
    }
}
