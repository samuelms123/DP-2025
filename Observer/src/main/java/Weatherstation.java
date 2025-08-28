import java.util.ArrayList;
import java.util.List;

public class Weatherstation implements Subject {
    private double temperature;
    private final double maxTemperature;
    private final double minTemperature;

    private List<Observer> observers = new ArrayList<>();

    public Weatherstation() {
        temperature = 15;
        maxTemperature = 50;
        minTemperature = -40;
    }

    public double getData() {
        return temperature;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                double tempChange = Math.random() >= 0.5 ? 1 : -1;
                temperature += tempChange;
                temperature = Math.max(minTemperature, Math.min(maxTemperature, temperature));
                notifyObservers();
                System.out.println();
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
