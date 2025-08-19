public class SwampTile implements Tile{
    private String desc = "Swamp Tile";
    private char type = 'S';

    @Override
    public char getCharacter() {
        return type;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
