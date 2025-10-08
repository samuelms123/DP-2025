public class ClearGridCommand implements Command {
    Grid grid;

    public ClearGridCommand(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.clear();
    }
}
