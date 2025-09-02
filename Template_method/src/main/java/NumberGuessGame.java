import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame extends Game {
    private List<Player> players = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private List<Player> roundWinners = new ArrayList<>();
    private Player currentPlayer;
    private int targetNumber;
    private int numberOfPlayers;

    @Override
    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player());
        }
        Random rand = new Random();
        //targetNumber = 15;
        targetNumber = rand.nextInt(19) + 1;

        System.out.println("""
                
                WELCOME TO THE NUMBER GUESS GAME!
                Rules : Computer draws a random number between 1-20.
                Each player tries to guess the number and closest guess wins the game.
                If you fail to enter integer, you will be disqualified, best of luck!
                
                """);
    }

    @Override
    public boolean endOfGame() {
        if (currentPlayer != null) {
            return currentPlayer.getPlayerNumber() == numberOfPlayers;
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        currentPlayer = players.get(player);
        System.out.println("Player " + currentPlayer.getPlayerNumber() + "'s turn!");
        System.out.print("Enter your guess: ");
        String guess = scanner.nextLine();

        try {
            currentPlayer.setLatestGuess(Integer.parseInt(guess));
        } catch (NumberFormatException e) {
            currentPlayer.setDnf(true);
        }



    }

    @Override
    public void displayWinner() {
        calculateWinner();
        System.out.println("\nTarget number was: " + targetNumber + "\n");
        for (Player player : players) {
            if (player.isDnf()) {
                System.out.println("Player " + player.getPlayerNumber() + ". was disqualified, learn to play the game.");
                continue;
            }
            System.out.println("Player " + player.getPlayerNumber() + "'s guess: " + player.getLatestGuess());
        }

        System.out.println("\nWinner(s): ");
        for (Player roundWinner : roundWinners) {
            System.out.println("Player " + roundWinner.getPlayerNumber() + ". With a guess of " + roundWinner.getLatestGuess());
        }
    }

    public void calculateWinner() {
        int closestGuess = 20;
        for (Player player : players) {
            if (player.isDnf()) {
                continue;
            }
            int guessScore = Math.abs(player.getLatestGuess() - targetNumber);

            if (guessScore < closestGuess) {
                closestGuess = guessScore;
                roundWinners.removeAll(players);
                roundWinners.add(player);
            }
            else if (guessScore == closestGuess) {
                roundWinners.add(player);
            }
        }

    }
}
