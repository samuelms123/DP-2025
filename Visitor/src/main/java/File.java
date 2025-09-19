public class File implements FileSystemElement {
    private String type;
    private String name;
    private double size;

    public File(String type, String name, double sizeInMB) {
        this.type = type;
        this.name = name;
        this.size = sizeInMB;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String toString() {
        return name + "." + type +  " | " + size + " MB";
    }
}
