package Game.States;

import Game.PlayerCharacter;

public class ExpertState implements State {
    PlayerCharacter character;
    private int xpThreshold = 100;

    public ExpertState(PlayerCharacter character) {
        this.character = character;
    }

    @Override
    public void train() {
        character.setXP(character.getXP() + 10);
        System.out.println("Training...");

        if (character.getXP() >= xpThreshold) {
            character.setState(new MasterState(character));
            character.setXP(0);
            character.setLevel(character.getLevel() + 1);

            System.out.println("Level Up! Current Level: " + character.getLevel());
        }
    }

    @Override
    public void meditate() {
        character.setHP(Math.min(character.getMaxHP(), character.getHP() + 20));
        System.out.println("Meditating...");
    }

    @Override
    public void fight() {
        double enemyPunch = Math.round(Math.random() * 40);
        double characterPunch = Math.round(Math.random() * 40);

        System.out.println("You damaged the opponent -" + characterPunch + " HP!");
        System.out.println("Enemy damaged you -" + enemyPunch + " HP!");

        character.setHP(character.getHP() - (int) enemyPunch);

        if (characterPunch >= enemyPunch) {
            System.out.println("You won the fight!");

        }
        else {
            System.out.println("You lost the fight and gained nothing!");
        }
    }

    @Override
    public int getXPThreshold() {
        return xpThreshold;
    }

    @Override
    public void displayAvailableActions() {
        System.out.println("Current available actions: Train, Meditate, Fight");
    }
}
