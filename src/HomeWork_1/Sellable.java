package HomeWork_1;

public interface Sellable {
    int MAX_VOLUME = 1000;// константа
    int getPrice();
    default String getProductDetails(Product product) {
        return product.getName() + " - " + product.getVolume() + "ml";
    }

    Product getProduct(String name, int volume);

}

