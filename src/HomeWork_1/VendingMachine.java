package HomeWork_1;

public interface VendingMachine {
    Product getProduct( String name,int volume);
    Product getProduct( String name, int volume, int temperature);
}
