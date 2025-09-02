public class Player {
    private static int nextPlayerNumber = 1;
    private final int playerNumber;
    private int roundWins;
    private int latestGuess;
    private boolean dnf = false;

    public Player() {
        this.playerNumber = nextPlayerNumber;
        nextPlayerNumber++;
        this.roundWins = 0;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getLatestGuess() {
        return latestGuess;
    }

    public int getRoundWins() {
        return roundWins;
    }

    public void addRoundWin() {
        roundWins++;
    }

    public void setLatestGuess(int latestGuess) {
        this.latestGuess = latestGuess;
    }

    public void setDnf(boolean dnf) {
        this.dnf = dnf;
    }

    public boolean isDnf() {
        return dnf;
    }


}
