package HomeWork_1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args){
        // Создаем список  продуктов

         Product product1 = new Product("Apple", 100, 10);
         Product product2 = new Product("Banana", 200, 15);
           System.out.println((product1.getProductDetails(product1)));
           System.out.println(product2.getProductDetails(product2));

           // Создаем список продуктов для сортировки
        List<Product>products =Arrays.asList(product1,product2);

        //Создаем компаратор для сортировки продуктов по их цене
        Comparator<Product>comparator= Comparator.comparingInt(Product::getPrice);

        //Сортируем продукты с помощью  компаратора и утилитарного класса
        List<Product>sortedProducts = SortingUtil.sort(products,comparator);

        //Выводим отсортированнный список продуктов
        for (Product product: sortedProducts){
            System.out.println(product.getName() + " - " + product.getPrice());
        }

        Market market = new Market();

        Person person1 = new Person("John");
        Person person2 = new Person("Jane");

        market.addPerson(person1);
        market.addPerson(person2);

        market.update();

        HotDrinkMachine machine = new HotDrinkMachine();

           HotDrink coffee = machine.getHotDrink("Coffee", 300, 85, 100);
           HotDrink tea = machine.getHotDrink("Tea", 200, 90, 80);


    // Создаем обработчик заказов
    OrderProcessor orderProcessor = person -> System.out.println(" Processing order for" + person.getName());
    // Обрабатываем заказы для каждого человекав магазине
    orderProcessor.processOrder(person1);
    orderProcessor.processOrder(person2);
}
}