import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Game extends Application {
    private static final int TILE_SIZE = 32;
    private static final int MAP_WIDTH = 20;
    private static final int MAP_HEIGHT = 15;

    @Override
    public void start(Stage stage) throws Exception {
        WildernessMap wildu = new WildernessMap(MAP_WIDTH, MAP_HEIGHT, TILE_SIZE);

        Canvas canvas = new Canvas(MAP_WIDTH * TILE_SIZE, MAP_HEIGHT * TILE_SIZE);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        wildu.displayMap(gc);

        Pane root = new Pane(canvas);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("RPG Map Generator");
        stage.show();

    }
}
