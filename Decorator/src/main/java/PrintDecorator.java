public class PrintDecorator extends Printer {
    private Printer printer;

    public PrintDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(text);
    }
}
