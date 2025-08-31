package Game;

import Game.States.NoviceState;
import Game.States.State;

public class PlayerCharacter {
    private String name;
    private int overallLevel;
    private int xp;
    private int hp;
    private int maxHP = 100;
    private boolean isAlive;
    State currentState;

    public PlayerCharacter(String name) {
        this.name = name;
        this.overallLevel = 1;
        this.xp = 0;
        this.hp = maxHP;
        this.isAlive = true;
        this.currentState = new NoviceState(this);
    }

    public void train() {
        currentState.train();
    }

    public void meditate() {
        currentState.meditate();
    }

    public void fight() {
        currentState.fight();
    }

    public void setState(State newState) {
        currentState = newState;
    }

    public void setLevel(int level) {
        this.overallLevel = level;
    }

    public void setXP(int xp) {
        this.xp = xp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public State getState() {
        return currentState;
    }

    public int getLevel() {
        return overallLevel;
    }

    public int getXP() {
        return xp;
    }

    public int getHP() {
        return hp;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public String toString() {
        return name + " status: \n"
                + "Level: " + overallLevel + "\n"
                + "XP: " + xp + "/" + currentState.getXPThreshold() + "\n"
                + "HP: " + hp + "/" + maxHP + "\n";
    }

}
