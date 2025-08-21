package components.blocky;

import components.Button;

public class BlockyButton extends Button {
    String text;

    public BlockyButton(String text) {
        this.text = text;
    }
    @Override
    public void display() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 1; j++) {
                if (i == 0 || i == 2) {
                    for (int k = 0; k < text.length() + 4; k++) {
                        System.out.print("#");
                    }
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
