public class ToShape {
    private double width;
    private double height;

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public  void showDim() {
        System.out.printf( "Ширина: %.2f, высота: %.2f \n", width, height);
    }
}

class Triangle extends ToShape {
    private String style;

    public Triangle(String style) {
        this.style = style;
    }

    public double area() {
        return getHeight() * getWidth() / 2;
    }

    public void showStyle() {
        System.out.printf("Треугольник %s\n", style);
    }
}
class Rectangle extends ToShape {

    // Конструктор без параметров
    public Rectangle() {
        setWidth(1.0);
        setHeight(1.0);
    }

    // Конструктор с параметрами
    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double calculateArea() {
        return getWidth() * getHeight();
    }

    public double calculatePerimeter() {
        return 2 * (getWidth() + getHeight());
    }
}
