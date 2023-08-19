package HomeWork_7;

public class Divide implements Operation {
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        double denom = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denom;
        double imaginary = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denom;
        return new ComplexNumber(real, imaginary);
    }
}
