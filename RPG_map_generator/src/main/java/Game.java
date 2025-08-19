public class Game {

    public static void main(String[] args) {
        Map map = createMap(2);
        map.displayMap();
    }

    public static Map createMap(int type) {
        switch (type) {
            case 1:
                return new CityMap();
            case 2:
                return new WildernessMap();
            default:
                throw new IllegalArgumentException("Invalid map type");
        }
    }
}
