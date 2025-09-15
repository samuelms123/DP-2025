package guistate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Memento implements IMemento {
    private int[] options;
    private boolean selected;
    private LocalTime time;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Memento(int[] options, boolean selected) {
        this.options = options.clone(); // Copy options array
        this.selected = selected;
        this.time = LocalTime.now();
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {return selected;}

    public String toString() {
        return formatter.format(time);
    }
}
