package work6;

/**
 * Implements the Polar coordinate system (r, θ).
 */
public class PolarSystem implements CoordinateSystem {
    /**
     * Transforms a point from Cartesian coordinates to Polar coordinates.
     *
     * @param point the input point in Cartesian coordinates.
     * @return the transformed point in Polar coordinates (r, θ).
     */
    @Override
    public Point transform(Point point) {
        double r = Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY());
        double theta = Math.atan2(point.getY(), point.getX());
        return new Point(r, theta); // r - radius, theta - angle.
    }
}
