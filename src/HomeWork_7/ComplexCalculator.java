package HomeWork_7;
import java.util.logging.Logger;

    public class ComplexCalculator {
        public static void main(String[] args) {
            ComplexNumber num1 = new ComplexNumber(2, 3);
            ComplexNumber num2 = new ComplexNumber(1, 1);

            Calculator addCalc = new Calculator(new Add());
            addCalc.performOperation(num1, num2);

            Calculator multiplyCalc = new Calculator(new Multiply());
            multiplyCalc.performOperation(num1, num2);

            Calculator divideCalc = new Calculator(new Divide());
            divideCalc.performOperation(num1, num2);
        }
    }

