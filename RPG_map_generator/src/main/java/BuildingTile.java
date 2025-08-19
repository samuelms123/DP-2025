public class BuildingTile implements Tile{
    private String desc = "Building Tile";
    private char type = 'B';

    @Override
    public char getCharacter() {
        return type;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
