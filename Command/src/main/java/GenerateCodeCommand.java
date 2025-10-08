public class GenerateCodeCommand implements Command {
    Grid grid;
    public GenerateCodeCommand(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.generateCode();
    }
}
