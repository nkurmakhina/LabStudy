import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Map2D {
    @Getter
    @Setter
    private int width;

    @Getter
    @Setter
    private int height;

    @Getter
    @Setter
    private int[][] cells;

    @Getter
    @Setter
    @NonNull
    private Location start;

    @Getter
    @Setter
    @NonNull
    private Location finish;

    public Map2D(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                    "width and height must be positive values; got " + width +
                            "x" + height);
        }

        this.width = width;
        this.height = height;

        cells = new int[width][height];

        start = new Location(0, height / 2);
        finish = new Location(width - 1, height / 2);
    }

    private void checkCoords(int x, int y) {
        if (x < 0 || x > width) {
            throw new IllegalArgumentException("x must be in range [0, " +
                    width + "), got " + x);
        }

        if (y < 0 || y > height) {
            throw new IllegalArgumentException("y must be in range [0, " +
                    height + "), got " + y);
        }
    }

    public boolean contains(int x, int y) {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }

    public boolean contains(Location loc) {
        return contains(loc.xCoord, loc.yCoord);
    }

    public int getCellValue(int x, int y) {
        checkCoords(x, y);
        return cells[x][y];
    }

    public int getCellValue(Location loc) {
        return getCellValue(loc.xCoord, loc.yCoord);
    }

    public void setCellValue(int x, int y, int value) {
        checkCoords(x, y);
        cells[x][y] = value;
    }
}
