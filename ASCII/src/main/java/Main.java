import components.Button;
import components.Checkbox;
import components.TextField;

import java.util.Scanner;

// Finish component display() s

public class Main {
    static UIFactory factory;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<<Enter number for chosen style>>");
        System.out.println("1. Simple style");
        System.out.println("2. Blocky style");
        String style = sc.nextLine();

        switch (style) {
            case "1":
                factory = new SimpleFactory();
                break;

            case "2":
                factory = new BlockyFactory();
                break;

            default:
                System.out.println("Invalid style");
                break;

        }
        Button btn = factory.createButton("Button");
        TextField tf = factory.createTextField("TextField");
        Checkbox cb = factory.createCheckBox("Checkbox");

        btn.display();
        tf.display();
        cb.display();
    }
}
