import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Grid {
    private static final int COLS = 8;
    private static final int ROWS = 8;

    private final boolean[][] pixels = new boolean[ROWS][COLS];
    private final Rectangle[][] rects = new Rectangle[ROWS][COLS];

    private int cursorRow = 0;
    private int cursorCol = 0;

    public int getCols() { return COLS; }
    public int getRows() { return ROWS; }

    // Initialize rectangles
    public void initRect(int r, int c, Rectangle rect) {
        rects[r][c] = rect;
    }

    // Logic methods
    public void moveUp()    { cursorRow = Math.max(0, cursorRow - 1); }
    public void moveDown()  { cursorRow = Math.min(ROWS - 1, cursorRow + 1); }
    public void moveLeft()  { cursorCol = Math.max(0, cursorCol - 1); }
    public void moveRight() { cursorCol = Math.min(COLS - 1, cursorCol + 1); }

    public void clear() {
        System.out.println("clear");
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                pixels[row][col] = false;
                Rectangle rect = rects[row][col];
                rect.setFill(Color.WHITE);
            }
        }
    }

    public void togglePixel() {
        pixels[cursorRow][cursorCol] = !pixels[cursorRow][cursorCol];
        Rectangle r = rects[cursorRow][cursorCol];
        r.setFill(pixels[cursorRow][cursorCol] ? Color.BLACK : Color.WHITE);
    }

    public void generateCode() {
        System.out.println("int[][] pixelArt = {");
        for (int r = 0; r < ROWS; r++) {
            System.out.print("    {");
            for (int c = 0; c < COLS; c++) {
                int value = pixels[r][c] ? 1 : 0;
                System.out.print(value);
                if (c < COLS - 1) System.out.print(", ");
            }
            System.out.print("}");
            if (r < ROWS - 1) System.out.print(",");
            System.out.println();
        }
        System.out.println("};");
    }

    public void updateCursorVisuals() {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                Rectangle rect = rects[r][c];
                rect.setStroke(Color.GRAY);
                rect.setStrokeWidth(1);
            }
        }
        Rectangle selected = rects[cursorRow][cursorCol];
        selected.setStroke(Color.RED);
        selected.setStrokeWidth(3);
    }
}

