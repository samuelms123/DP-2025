import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

// C=CLEAR | ENTER=GENERATE CODE | SPACE=TOGGLE PIXEL | WASD=MOVE" //
public class Gui extends Application { //
    private static final int CELL_SIZE = 40;

    private Grid grid; // Receiver
    private Command up, down, left, right, togglePixel, generateCode, clearGrid;

    @Override
    public void start(Stage stage) {
        grid = new Grid();

        up = new MoveCursorUpCommand(grid);
        down = new MoveCursorDownCommand(grid);
        left = new MoveCursorLeftCommand(grid);
        right = new MoveCursorRightCommand(grid);
        togglePixel = new TogglePixelCommand(grid);
        generateCode = new GenerateCodeCommand(grid);
        clearGrid = new ClearGridCommand(grid);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(2);
        gridPane.setVgap(2);

        for (int r = 0; r < grid.getRows(); r++) {
            for (int c = 0; c < grid.getCols(); c++) {
                Rectangle rect = new Rectangle(CELL_SIZE, CELL_SIZE);
                rect.setStroke(Color.GRAY);
                rect.setFill(Color.WHITE);
                grid.initRect(r, c, rect);
                gridPane.add(rect, c, r);
            }
        }

        BorderPane root = new BorderPane(gridPane);
        Scene scene = new Scene(root);
        scene.addEventFilter(KeyEvent.KEY_PRESSED, this::handleKey);

        stage.setTitle("Pixel Art");
        stage.setScene(scene);
        stage.show();

        grid.updateCursorVisuals();
    }

    private void handleKey(KeyEvent ev) {
        KeyCode code = ev.getCode();
        switch (code) {
            case W -> up.execute();
            case S -> down.execute();
            case A -> left.execute();
            case D -> right.execute();
            case C -> clearGrid.execute();
            case SPACE -> togglePixel.execute();
            case ENTER -> generateCode.execute();
            default -> {
                return;
            }
        }
        grid.updateCursorVisuals();
        ev.consume();
    }
}