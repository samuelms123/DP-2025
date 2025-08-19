public class ForestTile implements Tile{
    private String desc = "Forest Tile";
    private char type = 'F';

    @Override
    public char getCharacter() {
        return type;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
