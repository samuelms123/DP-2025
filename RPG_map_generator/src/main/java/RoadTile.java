public class RoadTile implements Tile {
    private String desc = "Road Tile";
    private char type = 'R';

    @Override
    public char getCharacter() {
        return type;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
