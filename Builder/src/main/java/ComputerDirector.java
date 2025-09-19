public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void buildComputer() {
        computerBuilder.buildProcessor();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildHardDrive();
        computerBuilder.buildRAM();
        computerBuilder.buildOS();
    }

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
}
