package exercise;

// BEGIN
public class Circle {

    private Point point;
    private int radius;

    public Circle (Point point, int radius) {
        this.radius = radius;
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }
    public double getSquare() throws NegativeRadiusException {
        if (getRadius() < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        }

        return Math.PI * (getRadius() * getRadius());
    }
}
// END
