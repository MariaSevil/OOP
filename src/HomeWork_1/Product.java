package HomeWork_1;

public class Product implements Sellable, java.lang.Comparable<Product> {
    private String name;
    private int volume;
    private int price;

    public Product(String name, int volume, int price){
        if (price < 0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
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
        if (volume > MAX_VOLUME) {
            System.out.println("The requested volume is too large");
            return null;
        }
        return new Product(name, volume, this.price);
    }
    public int getPrice(){
        return this.price;
    }
    public String getProductDetails(){
        return this.name + " - " + this.volume + " ml -" + this.price + " rubles";
    }
    public int compareTo(Product other){
        return Integer.compare(this.price,other.price);
    }
}

