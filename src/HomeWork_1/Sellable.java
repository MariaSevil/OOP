package HomeWork_1;

public interface Sellable {
    int MAX_VOLUME = 1000;// константа
    int getPrice();
    String getName();
    int getVolume();
    default String getProductDetails(Sellable sellable) {
        return sellable.getName() + " - " + sellable.getVolume() + "ml";
    }

    Product getProduct(String name, int volume);

}

