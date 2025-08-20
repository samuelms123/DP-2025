package components.simple;

import components.Button;

public class SimpleButton extends Button {
    String text;

    public SimpleButton(String text) {
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
