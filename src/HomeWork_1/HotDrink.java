package HomeWork_1;

public class HotDrink extends Product{
    private int temperature;

    public HotDrink(String name,int volume,int temperature){
        super(name,volume);
        this.temperature = temperature;
    }
}
