import java.util.Random;

public class WildernessMap extends Map {

    public WildernessMap(int width, int height, int tileSize) {
        super(width, height, tileSize);
    }

    public TileImage createTile() {

        Random rand = new Random();
        int tileNumber = 1 + rand.nextInt(3);

        switch (tileNumber) {
            case 1: return TileFactory.getImage(TileType.WATER);
            case 2: return TileFactory.getImage(TileType.FOREST);
            case 3: return TileFactory.getImage(TileType.SWAMP);
            default: throw new IllegalArgumentException("Invalid tile number in createTile");

        }
    }
}
