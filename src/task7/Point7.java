package task7;
import java.util.Objects;

public class Point7 {
    //поля
    private double x, y;
    //свойства
    public double getX()
    {
        return this.x;
    };
    public double getY()
    {
        return this.y;
    };
    //конструкторы
    public Point7(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //методы
    public String toString()
    {
        return "{" + this.x + ";" + this.y + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point7 point = (Point7) obj;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
