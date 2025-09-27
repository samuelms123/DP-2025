import java.util.EnumMap;
import java.util.Map;

public class TileFactory {
    private static final Map<TileType, TileImage> images = new EnumMap<>(TileType.class);

    public static TileImage getImage(TileType type) {
        // Check if image exists
        TileImage image = images.get(type);
        // If doesnt exist, create one
        if (image == null) {
            image = switch (type) {
                case WATER -> new TileImage(getResourcePath("water-tile.png"));
                case ROAD -> new TileImage(getResourcePath("road-tile.png"));
                case SWAMP -> new TileImage(getResourcePath("swamp-tile.png"));
                case BUILDING -> new TileImage(getResourcePath("building-tile.png"));
                case FOREST -> new TileImage(getResourcePath("forest-tile.png"));
            };
            // Store it to the Map
            images.put(type, image);
        }
        return image;
    }

    private static String getResourcePath(String filename) {
        return TileFactory.class.getResource("/" + filename).toExternalForm();
    }

}
