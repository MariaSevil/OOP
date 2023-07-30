package HomeWork_1;

public class Main {
    public static void main(String[] args){
        // Создаем продукты

        Product product1 = new Product("Apple", 100, 10);
        Product product2 = new Product("Banana", 200, 15);

        System.out.println(product1.getProductDetails(product1));
        System.out.println(product2.getProductDetails(product2));

        Market market = new Market();

        Person person1 = new Person("John");
        Person person2 = new Person("Jane");

        market.addPerson(person1);
        market.addPerson(person2);

        market.update();

        HotDrinkMachine machine = new HotDrinkMachine();

        HotDrink coffee = machine.getHotDrink("Coffee", 300, 85, 100);
        HotDrink tea = machine.getHotDrink("Tea", 200, 90, 80);
    }
}