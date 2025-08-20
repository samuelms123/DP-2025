import components.Button;
import components.Checkbox;
import components.TextField;
import components.blocky.BlockyButton;
import components.blocky.BlockyCheckbox;
import components.blocky.BlockyTextField;

public class BlockyFactory extends UIFactory {

    @Override
    public Button createButton(String text) {
        return new BlockyButton(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new BlockyTextField(text);
    }

    @Override
    public Checkbox createCheckBox(String text) {
        return new BlockyCheckbox(text);
    }
}
