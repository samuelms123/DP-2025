public class MoveCursorDownCommand implements Command {
    Grid grid;

    public MoveCursorDownCommand(Grid grid) {
        this.grid = grid;
    }
    @Override
    public void execute() {
        grid.moveDown();
    }
}
