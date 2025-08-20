package components.blocky;

import components.Button;

public class BlockyButton extends Button {
    String text = "Click Me";

    public BlockyButton(String text) {
        this.text = text;
    }
    @Override
    public void display() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 1; j++) {
                if (i == 0 || i == 2) {
                    System.out.print("################");
                } else {
                    System.out.print("# " + text + " #");
                }
            }
        }
        System.out.println();
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
