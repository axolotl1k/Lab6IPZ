package work6;

import java.util.function.Function;

/**
 * Represents a mathematical function and allows its graphical representation
 * using a specified coordinate system.
 */
public class MathFunction {
    private Function<Double, Double> function; // The mathematical function.
    private CoordinateSystem coordinateSystem; // The current coordinate system.

    /**
     * Constructor for MathFunction.
     *
     * @param function          the mathematical function (e.g., y = f(x)).
     * @param coordinateSystem  the coordinate system used for graphing.
     */
    public MathFunction(Function<Double, Double> function, CoordinateSystem coordinateSystem) {
        this.function = function;
        this.coordinateSystem = coordinateSystem;
    }

    /**
     * Updates the coordinate system dynamically.
     *
     * @param coordinateSystem the new coordinate system.
     */
    public void setCoordinateSystem(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    /**
     * Plots the graph of the function over a specified range.
     *
     * @param start the starting x-value.
     * @param end   the ending x-value.
     * @param step  the step size for x-values.
     */
    public void drawGraph(double start, double end, double step) {
        for (double x = start; x <= end; x += step) {
            double y = function.apply(x);
            Point point = coordinateSystem.transform(new Point(x, y));
            System.out.println("Point: " + point);
        }
    }
}
