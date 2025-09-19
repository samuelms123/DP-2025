import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String type;
    private List<FileSystemElement> foundFiles;

    public SearchVisitor(String type) {
        this.type = type;
        foundFiles = new ArrayList<>();
    }
    @Override
    public void visit(Directory directory) {
        System.out.println("SEARCHING IN DIRECTORY: " + directory.getName());
    }

    @Override
    public void visit(File file) {
        if (file.getType().equals(type)) {
            foundFiles.add(file);
        }
    }

    public List<FileSystemElement> getFoundFiles() {
        return foundFiles;
    }

    public void setSearchType(String type) {
        this.type = type;
    }
}
