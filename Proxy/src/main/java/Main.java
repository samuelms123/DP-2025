public class Main {
    public static void main(String[] args) throws AccessDeniedException {
        Library lib = new Library();
        User joonas = new User("Joonas");
        User tiina = new User("Tiina");

        lib.createDocument(1, "Ei salaista sisältöä");
        lib.createPrivateDocument(2, "Salaista", tiina);

        try {
            System.out.println(lib.getDocument(2).getCreationDate()); // Date is accessible
            System.out.println(lib.getDocument(2).getContent(joonas)); // No access
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(lib.getDocument(2).getContent(tiina)); // Has access
        System.out.println(lib.getDocument(1).getContent(joonas)); // Public access document

    }
}
