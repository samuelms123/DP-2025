package guistate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> undoHistory; // Memento history
    private List<IMemento> redoHistory;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.undoHistory = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public ObservableList<IMemento> getUndoHistory() {
        return FXCollections.observableArrayList(undoHistory);
    }

    public ObservableList<IMemento> getRedoHistory() {
        return FXCollections.observableArrayList(redoHistory);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!undoHistory.isEmpty()) {
            System.out.println("Memento found in undoHistory");

            IMemento currentState = model.createMemento();
            redoHistory.add(currentState);

            IMemento previousState = undoHistory.remove(undoHistory.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
            gui.updateHistory();
        }
    }

    public void redo() {
        if (!redoHistory.isEmpty()) {
            System.out.println("Memento found in redoHistory");

            IMemento currentState = model.createMemento();
            undoHistory.add(currentState);

            IMemento previousState = redoHistory.remove(redoHistory.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
            gui.updateHistory();
        }
    }

    public void moveToMemento(Object memento) {
        model.restoreState((IMemento) memento);
        gui.updateGui();
        System.out.println("State restored");
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        undoHistory.add(currentState);
        redoHistory.clear();
        gui.updateHistory();
    }
}
