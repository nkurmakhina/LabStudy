import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lab2 {
    public static double getDouble(String message) {

        System.out.println(message);

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            try {
                double d = Double.parseDouble(s);
                return d;
            } catch (NumberFormatException e) {
                return 0.0;
            }
        } catch (IOException e) {
            return 0.0;
        }
    }


    public static void main(String[] args) {

        Point3d point0 = new Point3d(getDouble("Point 0 xCoord"),
                getDouble("Point 0 yCoord"), getDouble("Point 0 zСoord"));

        Point3d point1 = new Point3d(getDouble("Point 1 xCoord"),
                getDouble("Point 1 yCoord"), getDouble("Point 1 zCoord"));

        Point3d point2 = new Point3d(getDouble("Point 2 xCoord"),
                getDouble("Point 2 yCoord"), getDouble("Point 2 zCoord"));

        if (point0.equals(point1) || point1.equals(point2) || point0.equals(point2)) {
            System.out.println("Одна из точек равна другой");
            System.exit(0);
        }

        double area = computeArea(point0, point1, point2);
        System.out.printf("Площадь: %.4f ", area);
    }

    public static double computeArea(Point3d point0, Point3d point1, Point3d point2) {

        double a = point0.distanceTo(point1);
        double b = point1.distanceTo(point2);
        double c = point0.distanceTo(point2);

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
