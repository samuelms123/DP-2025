public class XMLPrinter extends PrintDecorator{

    public XMLPrinter(Printer printer) {
        super(printer);
    }
    @Override
    public void print(String text) {
        super.print("<message>" + text + "</message>");
    }
}
