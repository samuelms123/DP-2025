import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private List<FileSystemElement> elements;
    private String name;

    public Directory(String name) {
        elements = new ArrayList<>();
        this.name = name;

    }

    public void add(FileSystemElement element) {
        elements.add(element);
    }

    public void remove(FileSystemElement element) {
        elements.remove(element);
    }

    public String getName() {
        return name;
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        for (FileSystemElement element : elements) {
            element.accept(visitor);
        }
    }
}
