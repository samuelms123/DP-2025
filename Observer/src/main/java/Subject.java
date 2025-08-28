
public interface Subject extends Runnable{
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    double getData();
}
