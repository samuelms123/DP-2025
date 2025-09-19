public class Main {

    public static void main(String[] args) {
        MacBuilder macBuilder = new MacBuilder();
        WindowsBuilder windowsBuilder = new WindowsBuilder();

        ComputerDirector director = new ComputerDirector(windowsBuilder);

        director.buildComputer();
        System.out.println(windowsBuilder.getComputer());

        System.out.println();

        director.setComputerBuilder(macBuilder);
        director.buildComputer();
        System.out.println(macBuilder.getComputer());
    }
}
