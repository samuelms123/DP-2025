public class Main {
    public static void main(String[] args) {
        Printer printer;

        printer = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        printer.print("Hello World");
    }
}
