package Game.States;

import Game.PlayerCharacter;

public class NoviceState implements State {
    PlayerCharacter character;
    private final int xpThreshold = 30;

    public NoviceState(PlayerCharacter character) {
        this.character = character;
    }

    @Override
    public void train() {
        character.setXP(character.getXP() + 10);
        System.out.println("Training...");

        if (character.getXP() >= xpThreshold) {
            character.setState(new IntermediateState(character));
            character.setXP(0);
            character.setLevel(character.getLevel() + 1);

            System.out.println("Level Up! Current Level: " + character.getLevel());
            System.out.println("New skill learned: Meditate");
        }
    }

    @Override
    public void meditate() {
        System.out.println("Skill not learned yet!");
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
        System.out.println("Current available actions: Train");
    }
}
