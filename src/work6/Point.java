package work6;

/**
 * Represents a point in 2D space, defined by its x and y coordinates.
 */
public class Point {
    private double x; // The x-coordinate.
    private double y; // The y-coordinate.

    /**
     * Constructor for Point.
     *
     * @param x the x-coordinate.
     * @param y the y-coordinate.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x-coordinate of the point.
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y-coordinate of the point.
     */
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
