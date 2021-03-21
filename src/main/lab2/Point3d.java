import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Point3d {

    @Getter
    @Setter
    private double xCoord;

    @Getter
    @Setter
    private double yCoord;

    @Getter
    @Setter
    private double zCoord;


    public boolean equals(Object obj) {
        if (obj instanceof Point3d) {
            Point3d other = (Point3d) obj;
            if (xCoord == other.getXCoord() &&
                    yCoord == other.getYCoord() &&
                    zCoord == other.getZCoord()) {
                return true;
            }
        }
        return false;
    }

    public double distanceTo(Point3d other_point) {
        return Math.sqrt(Math.pow(xCoord - other_point.getXCoord(), 2) +
                Math.pow(yCoord - other_point.getYCoord(), 2) +
                Math.pow(zCoord - other_point.getZCoord(), 2));
    }
}