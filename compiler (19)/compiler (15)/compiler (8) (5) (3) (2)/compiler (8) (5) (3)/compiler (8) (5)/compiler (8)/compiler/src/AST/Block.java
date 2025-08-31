package AST;

import java.util.ArrayList;
import java.util.List;

public class Block {
     List<Instruction> instructions = new ArrayList<Instruction>();

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
        return "\nBlock{" +
                "\ninstructions=" + instructions +
                "\n}";
    }
}
