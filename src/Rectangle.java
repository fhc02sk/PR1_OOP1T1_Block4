import java.util.Objects;

public class Rectangle {
    double length;
    double width;
    String name;

    public double calcArea() {
        return length * width;
    }

    public double calcDiagonal() {
        return Math.sqrt(length * length + Math.pow(width, 2));
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0
                && Double.compare(rectangle.width, width) == 0
                && Objects.equals(name, rectangle.name);
    }

}
