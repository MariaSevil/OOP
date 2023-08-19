package HomeWork_7;
import java.util.logging.Logger;
public class Calculator {
    private Operation operation;
    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public ComplexNumber performOperation(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = operation.execute(num1, num2);
        LOGGER.info("Performed " + operation.getClass().getSimpleName() + " on " + num1 + " and " + num2 + " -> Result: " + result);
        return result;
    }
}
