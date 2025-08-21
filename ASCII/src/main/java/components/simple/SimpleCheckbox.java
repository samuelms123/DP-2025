package components.simple;

import components.Checkbox;

public class SimpleCheckbox extends Checkbox {
    String text;

    public SimpleCheckbox(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("| " + text + " |");
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
