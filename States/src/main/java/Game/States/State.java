package Game.States;

public interface State {
    void train();
    void meditate();
    void fight();
    int getXPThreshold();
    void displayAvailableActions();
}
