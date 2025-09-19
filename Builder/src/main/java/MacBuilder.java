public class MacBuilder implements ComputerBuilder{
    private Computer computer;

    public MacBuilder() {
        computer = new Computer();
    }
    @Override
    public void buildProcessor() {
        computer.setProcessor("Apple M4");
    }

    @Override
    public void buildRAM() {
        computer.setRamSize(64);
    }

    @Override
    public void buildHardDrive() {
        computer.setDiskSize(1);
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Apple M4");
    }

    @Override
    public void buildOS() {
        computer.setOS("MacOS");
    }

    public Computer getComputer() {
        return computer;
    }
}
