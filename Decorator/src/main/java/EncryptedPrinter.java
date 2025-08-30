public class EncryptedPrinter extends PrintDecorator {

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        StringBuilder sb = new StringBuilder();
        char[] chars = text.toCharArray();

        for (Character c : chars) {
            sb.append(Integer.toBinaryString(c) + " ");
        }
        super.print(sb.toString());
    }
}
