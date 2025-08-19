public class WaterTile implements Tile{
    private String desc = "Water Tile";
    private char type = 'W';

    @Override
    public char getCharacter() {
        return type;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
