package Game;

import Game.States.MasterState;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the game!");
        System.out.print("Enter your name: ");
        String playerName = sc.nextLine();
        PlayerCharacter player = new PlayerCharacter(playerName);

        while (player.getIsAlive()) {
            System.out.println();
            System.out.println(player); // Player status

            System.out.println("[1] Train    [2] Meditate   [3] Fight   [4] Exit");
            System.out.print("Enter your action: ");
            String action = sc.nextLine();
            switch (action) {
                case "1":
                    player.train();
                    break;

                case "2":
                    player.meditate();
                    break;

                case "3":
                    player.fight();
                    break;

                case "4":
                    System.out.println("Thank you for playing!");
                    System.exit(0);
            }

            if (player.getHP() <= 0) {
                player.setIsAlive(false);
                System.out.println("YOU DIED!");
            } else if (player.getLevel() == 4) {
                System.out.println("Congratulations! You have reached master level! Thank you for playing!");
                System.exit(0);
            }
        }
    }
}
