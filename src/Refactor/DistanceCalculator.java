package refactor;

/*
 * Utiliza nombres más descriptvos para las variables.
 */

public class DistanceCalculator {

    double tiempo;
    double velocidad;

    public double calculateDistance(double tiempo, double velocidad) {
        return tiempo * velocidad;
    }
}
