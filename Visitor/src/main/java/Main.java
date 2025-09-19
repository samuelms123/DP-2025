public class Main {
    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        File manual = new File("md", "README", 0.5);

        Directory configDir = new Directory("config");
        File config = new File("txt", "config", 0.5);
        File paths = new File("txt", "paths", 0.5);

        Directory appDir = new Directory("app");
        File main = new File("java", "Main", 0.05);
        File randomClass = new File("java", "RandomClass", 0.05);

        rootDir.add(manual);
        rootDir.add(configDir);

        configDir.add(config);
        configDir.add(paths);

        rootDir.add(appDir);
        rootDir.add(main);
        rootDir.add(randomClass);


        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        SearchVisitor searchVisitor = new SearchVisitor("java");

        rootDir.accept(sizeCalculator);
        System.out.println("Total size: " + sizeCalculator.getTotalMB() + " MB");

        rootDir.accept(searchVisitor); // Search root directory for java files
        System.out.println("FOUND FILES:");
        searchVisitor.getFoundFiles().forEach(System.out::println);
    }
}
