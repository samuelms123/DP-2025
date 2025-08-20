import components.Button;
import components.Checkbox;
import components.TextField;
import components.simple.SimpleButton;
import components.simple.SimpleCheckbox;
import components.simple.SimpleTextField;

public class SimpleFactory extends UIFactory{

    @Override
    public Button createButton(String text) {
        return new SimpleButton(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new SimpleTextField(text);
    }

    @Override
    public Checkbox createCheckBox(String text) {
        return new SimpleCheckbox(text);
    }
}
