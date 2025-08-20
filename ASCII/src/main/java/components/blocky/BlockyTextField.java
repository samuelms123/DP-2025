package components.blocky;

import components.TextField;

public class BlockyTextField extends TextField {
    String text;

    public BlockyTextField(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println(text);
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
