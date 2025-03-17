package task7;
import java.util.Arrays;

public class Polyline7 {
    //поля
    private Point7[] points;

    // Свойства
    public Point7[] getPoints() {
        return points;
    }

    //конструкторы
    public Polyline7() {
        this.points = new Point7[0];;
    }

    public Polyline7(Point7[] points) {
        this.points = points;
    }

    //методы
    public String toString() {
        return "Линия " + Arrays.toString(points);
    }

}