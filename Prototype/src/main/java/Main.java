public class Main {
    public static void main(String[] args) {
        Book dune = new Book("Frank Herbert", "Dune", 1965);
        Book snowCrash = new Book("Neal Stephenson", "Snow Crash", 1992);
        Book martian = new Book("Andy Weir", "The Martian", 2011);

        Recommendation sciFi = new Recommendation("Sci-Fi fans");
        sciFi.addBook(dune);
        sciFi.addBook(snowCrash);
        sciFi.addBook(martian);

        System.out.println(sciFi);

        Book newEden = new Book("Menilik Henry Dyer", "a New Eden", 2023);

        Recommendation space = sciFi.clone();
        space.setTargetAudience("Space fans");
        space.addBook(newEden);
        space.removeBook("Dune");
        space.removeBook("Snow Crash");

        System.out.println(space);


    }
}
