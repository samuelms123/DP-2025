package Game.States;

import Game.PlayerCharacter;

public class MasterState implements State {
    PlayerCharacter character;

    public MasterState(PlayerCharacter character) {
        this.character = character;
    }

    @Override
    public void train() {
        System.out.println("No need for training anymore, you are a god");
    }

    @Override
    public void meditate() {
        System.out.println("No need for meditating anymore, you are invincible");
    }

    @Override
    public void fight() {
        System.out.println("You hit your enemy -"  + Math.round(Math.random() * 100000) + " and won the fight.");
    }

    @Override
    public int getXPThreshold() {
        return 0;
    }

    @Override
    public void displayAvailableActions() {
        System.out.println("Available actions: All of them");
    }
}
