import java.util.Random;

public class CityMap extends Map {

    public CityMap(int width, int height, int tileSize) {
        super(width, height, tileSize);
    }

    @Override
    public TileImage createTile() {

        Random rand = new Random();
        int tileNumber = 1 + rand.nextInt((3 - 1) + 1);

        switch (tileNumber) {
            case 1: return TileFactory.getImage(TileType.BUILDING);
            case 2: return TileFactory.getImage(TileType.FOREST);
            case 3: return TileFactory.getImage(TileType.ROAD);
            default: throw new IllegalArgumentException("Invalid tile number in createTile");

        }
    }
}
