
public class Main {
    public static void main(String[] args) {
        APIFacade facade = new APIFacade();

        try {
            System.out.println("JOKE API");
            String value = facade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
            System.out.println(value);
        }
        catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("FX RATES API");
            String value = facade.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "base");
            System.out.println(value);
        }
        catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
