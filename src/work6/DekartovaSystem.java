package work6;

/**
 * Implements the Dekartova (Cartesian) coordinate system (x, y).
 */
public class DekartovaSystem implements CoordinateSystem {
    /**
     * Transforms a point (no changes needed for Dekartova system).
     *
     * @param point the input point in Cartesian coordinates.
     * @return the same point.
     */
    @Override
    public Point transform(Point point) {
        return point; // No transformation needed.
    }
}
