package HomeWork_1;

public interface VendingMachine {
   HotDrink getHotDrink( String name,int volume, int temperature, int price);
    Product getProduct( String name, int volume, int price);
}
