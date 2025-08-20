package components.simple;

import components.Button;
import components.TextField;

public class SimpleTextField extends TextField {
    String text;

    public SimpleTextField(String text) {
        this.text = text;
    }

    @Override
    public void display() {

    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
