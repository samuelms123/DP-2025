public class MoveCursorUpCommand implements Command {
    Grid grid;
    public MoveCursorUpCommand(Grid grid) {
        this.grid = grid;
    }
    @Override
    public void execute() {
        grid.moveUp();
    }
}
