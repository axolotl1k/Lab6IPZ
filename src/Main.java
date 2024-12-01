import work6.*;

import java.util.function.Function;

/**
 * Main class to demonstrate graph plotting using different coordinate systems.
 *
 * The program defines a mathematical function and visualizes it in two coordinate systems:
 * Dekartova and Polar. It dynamically switches between these systems and outputs the transformed points.
 */
public class Main {
    public static void main(String[] args) {
        Function<Double, Double> parabola = x -> x * x; // y = x^2
        MathFunction mathFunction = new MathFunction(parabola, new DekartovaSystem());

        System.out.println("Декартова система координат:");
        mathFunction.drawGraph(-3, 3, 1);

        mathFunction.setCoordinateSystem(new PolarSystem());
        System.out.println("\nПолярна система координат:");
        mathFunction.drawGraph(-3, 3, 1);
    }
}
