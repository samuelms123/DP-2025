public class WeatherNotifier implements Observer {
    private String name;
    private Subject station;

    public WeatherNotifier(String name, Subject station) {
        this.name = name;
        this.station = station;
        station.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println(name + " ilmoittaa: Lämpötila " + station.getData() + " celsius astetta." );
    }
}
