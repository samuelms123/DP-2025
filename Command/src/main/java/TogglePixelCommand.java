public class TogglePixelCommand implements Command {
    Grid grid;
    public TogglePixelCommand(Grid grid) {
        this.grid = grid;
    }
    @Override
    public void execute() {
        grid.togglePixel();
    }
}
