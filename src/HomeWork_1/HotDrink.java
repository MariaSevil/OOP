package HomeWork_1;

public class HotDrink extends Product{
    private int temperature;

    public HotDrink(String name,int volume,int temperature,int price){
        super(name,volume,price);
        this.temperature = temperature;
    }
}
