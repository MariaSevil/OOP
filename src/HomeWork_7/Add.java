package HomeWork_7;

public class Add implements Operation {
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getReal() + num2.getReal(), num1.getImaginary() + num2.getImaginary());
    }
}
