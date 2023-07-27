public class Shapes {

public static void main( String[] args) {
    Triangle t1 = new Triangle("Черный");
    Triangle t2 = new Triangle("Белый");

    t1.setHeight(1.5);
    t1.setWidth(2.1);


    t2.setHeight(1.3);
    t2.setWidth(2.5);


    System.out.println("x: Информация о t1");
    t1.showStyle();
    t1.showDim();
    System.out.println("Площадь" + t1.area());

    System.out.println("Информация о t2");
    t2.showStyle();
    t2.showDim();
    System.out.println("Площадь" + t2.area());

    Rectangle r1 = new Rectangle(1.5, 2.1);
    Rectangle r2 = new Rectangle(1.3, 2.5);

        System.out.println("Информация о r1:");
                r1.showDim();
                System.out.println("Площадь: " + r1.calculateArea());
                System.out.println("Периметр: " + r1.calculatePerimeter());

                System.out.println("Информация о r2:");
                r2.showDim();
                System.out.println("Площадь: " + r2.calculateArea());
                System.out.println("Периметр: " + r2.calculatePerimeter());
}
}