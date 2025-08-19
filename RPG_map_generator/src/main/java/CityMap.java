import java.util.Random;

public class CityMap extends Map {
    private final Tile buildingTile;
    private final Tile forestTile;
    private final Tile roadTile;

    public CityMap() {
        buildingTile = new BuildingTile();
        forestTile = new ForestTile();
        roadTile = new RoadTile();
    }
    @Override
    public Tile createTile() {

        Random rand = new Random();
        int tileNumber = 1 + rand.nextInt((3 - 1) + 1);

        switch (tileNumber) {
            case 1: return buildingTile;
            case 2: return forestTile;
            case 3: return roadTile;
            default: throw new IllegalArgumentException("Invalid tile number in createTile");

        }
    }
}
