package work6;

/**
 * Interface representing a coordinate system for graphing points.
 */
public interface CoordinateSystem {
    /**
     * Transforms a point from Cartesian coordinates to the target coordinate system.
     *
     * @param point the point in Cartesian coordinates.
     * @return the transformed point in the target coordinate system.
     */
    Point transform(Point point);
}
