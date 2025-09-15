package guistate;

public class Memento implements IMemento {
    private int[] options;
    private boolean selected;

    public Memento(int[] options, boolean selected) {
        this.options = options.clone(); // Copy options array
        this.selected = selected;
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {
        return selected;
    }
}
