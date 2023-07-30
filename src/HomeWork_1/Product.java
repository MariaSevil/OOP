package HomeWork_1;

public class Product implements Sellable {
    private String name;
    private int volume;
    private int price;

    public Product(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getVolume() {
        return this.volume;
    }

    public Product getProduct(String name, int volume) {
        if (volume > Sellable.MAX_VOLUME) {
            System.out.println("The requested volume is too large");
            return null;
        }
        return new Product(name, volume, this.price);
    }
    public int getPrice(){
        return this.price;
    }
}

