public abstract class Map {

    abstract Tile createTile();

    public void displayMap() {

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + createTile().getCharacter() + " ");
            }
        }
        System.out.println();
    };
}
