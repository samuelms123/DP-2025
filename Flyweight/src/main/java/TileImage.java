import javafx.scene.image.Image;

public class TileImage implements Flyweight{
    private final Image image;

    public TileImage(String filePath) {
        this.image = new Image(filePath);
    }

    @Override
    public Image getImage() {
        return image;
    }
}
