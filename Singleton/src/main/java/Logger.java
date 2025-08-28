import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private FileWriter writer;
    private String fileName;

    private Logger() {
        fileName = "default.txt";
        initWriter();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;

    }

    private void initWriter() {
        try {
            if (writer != null) {
                writer.close();
            }
            writer = new FileWriter(fileName, true);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void setFilename(String filename) {
        this.fileName = filename;
        initWriter();
    }

    public void write(String str) {
        try {
            if (writer != null) {
                writer.write(str + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
