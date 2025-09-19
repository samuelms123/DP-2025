public class WindowsBuilder implements ComputerBuilder{
    private Computer computer;

    public WindowsBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel Core i7-9700K");
    }

    @Override
    public void buildRAM() {
        computer.setRamSize(64);
    }

    @Override
    public void buildHardDrive() {
        computer.setDiskSize(2);
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Nvidia GeForce RTX 5080");
    }

    @Override
    public void buildOS() {
        computer.setOS("Windows");
    }

    public Computer getComputer() {
        return computer;
    }
}
