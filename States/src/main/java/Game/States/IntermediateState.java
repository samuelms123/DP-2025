package Game.States;

import Game.PlayerCharacter;

public class IntermediateState implements State {
    PlayerCharacter character;
    private final int xpThreshold = 60;

    public IntermediateState(PlayerCharacter character) {
        this.character = character;
    }
    @Override
    public void train() {
        character.setXP(character.getXP() + 10);
        System.out.println("Training...");

        if (character.getXP() >= xpThreshold) {
            character.setState(new ExpertState(character));
            character.setXP(0);
            character.setLevel(character.getLevel() + 1);

            System.out.println("Level Up! Current Level: " + character.getLevel());
            System.out.println("New skill learned: Fight");
        }
    }

    @Override
    public void meditate() {
        character.setHP(Math.min(character.getMaxHP(), character.getHP() + 20));
        System.out.println("Meditating...");
    }

    @Override
    public void fight() {
        System.out.println("Skill not learned yet!");
    }

    @Override
    public int getXPThreshold() {
        return xpThreshold;
    }

    @Override
    public void displayAvailableActions() {
        System.out.println("Current available actions: Train, Meditate");
    }
}
