public class Main {
    public static void main(String[] args) {
        Subject weatherStation = new Weatherstation();
        Observer obs1 = new WeatherNotifier("Markku", weatherStation);
        Observer obs2 = new WeatherNotifier("Reinikainen", weatherStation);
        Observer obs3 = new WeatherNotifier("Pekka", weatherStation);

        Thread weatherSimulation = new Thread(weatherStation);

        weatherSimulation.start();

    }
}
