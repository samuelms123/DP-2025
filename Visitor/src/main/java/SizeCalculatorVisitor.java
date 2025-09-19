import java.util.List;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    double totalMB = 0;

    @Override
    public void visit(Directory directory) {
        System.out.println("IN DIRECTORY: " + directory.getName());
    }

    @Override
    public void visit(File file) {
        totalMB += file.getSize();
    }

    public double getTotalMB() {
        return totalMB;
    }
}
