public class MoveCursorLeftCommand implements Command {
    Grid grid;
    public MoveCursorLeftCommand(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.moveLeft();
    }
}
