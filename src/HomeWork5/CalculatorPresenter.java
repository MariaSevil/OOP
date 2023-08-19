package HomeWork5;

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void onCalculate(String operation, double a, double b) {
        double result;
        switch(operation) {
            case "+":
                result = model.add(a, b);
                break;
            case "-":
                result = model.subtract(a, b);
                break;
            case "*":
                result = model.multiply(a, b);
                break;
            case "/":
                result = model.divide(a, b);
                break;
            default:
                result = Double.NaN;
        }

        if (Double.isNaN(result)) {
            view.displayError("Недопустимая операция или деление на ноль");
        } else {
            view.displayResult(Double.toString(result));
        }
    }
}
