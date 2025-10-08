public class MoveCursorRightCommand implements Command {
    Grid grid;

    public MoveCursorRightCommand(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.moveRight();
    }
}
