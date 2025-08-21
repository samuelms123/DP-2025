package components.blocky;

import components.TextField;

public class BlockyTextField extends TextField {
    String text;

    public BlockyTextField(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        for (int i = 0; i < 7; i++) {
            System.out.println();
            for (int j = 0; j < 1; j++) {
                if (i == 3) {
                    System.out.print("#  " + text + "  #");
                }
                else if (i == 0 || i == 6) {
                    for (int k = 0; k < text.length() + 6; k++) {
                        System.out.print("#");
                    }
                }
                else {
                    for (int k = 0; k < text.length() + 6; k++) {
                        if (k == 0 || k == text.length() + 5) {
                            System.out.print("#");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
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
