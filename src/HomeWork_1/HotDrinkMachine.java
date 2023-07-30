package HomeWork_1;

public class HotDrinkMachine implements VendingMachine {
    public HotDrink getHotDrink(String name, int volume,int temperature, int price){
        return new HotDrink(name,volume,temperature,price);

    }
    public Product getProduct(String name, int volume, int price) {
        return  new Product (name, volume, price);
    }
}
