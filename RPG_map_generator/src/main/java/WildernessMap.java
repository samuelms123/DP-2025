import java.util.Random;

public class WildernessMap extends Map {
    private final Tile swampTile;
    private final Tile forestTile;
    private final Tile waterTile;

    public WildernessMap() {
        swampTile = new SwampTile();
        forestTile = new ForestTile();
        waterTile = new WaterTile();
    }
    @Override
    public Tile createTile() {

        Random rand = new Random();
        int tileNumber = 1 + rand.nextInt((3 - 1) + 1);

        switch (tileNumber) {
            case 1: return swampTile;
            case 2: return forestTile;
            case 3: return waterTile;
            default: throw new IllegalArgumentException("Invalid tile number in createTile");

        }
    }
}
