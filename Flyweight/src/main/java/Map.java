import javafx.scene.canvas.GraphicsContext;

public abstract class Map {
    protected int width;
    protected int height;
    protected int tileSize;

    public Map(int width, int height, int tileSize) {
        this.width = width;
        this.height = height;
        this.tileSize = tileSize;
    }

    public abstract TileImage createTile();

    public void displayMap(GraphicsContext gc) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                TileImage tile = createTile();
                gc.drawImage(tile.getImage(), x * tileSize, y * tileSize, tileSize, tileSize);
            }
        }
    }
}
