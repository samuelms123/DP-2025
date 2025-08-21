package components.blocky;

import components.Checkbox;

public class BlockyCheckbox extends Checkbox {
    String text;
    public BlockyCheckbox(String text) {
        this.text = text;
    }
    @Override
    public void display() {
        System.out.println();
        System.out.println("[[ " + text + " ]]");
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
