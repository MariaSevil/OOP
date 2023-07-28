package HomeWork_1;

public class HotDrinkMachine implements VendingMachine{
    @Override
    public HotDrink getProduct(String name, int volume,int temperture){
        return new HotDrink(name,volume,temperture);

    }
    @Override
    public Product getProduct(String name, int volume) {
        return  new Product (name, volume);
    }
}
