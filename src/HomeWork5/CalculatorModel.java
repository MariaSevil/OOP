package HomeWork5;

public class CalculatorModel {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        return b != 0.0 ? a / b : Double.NaN;
    }
}
