package HomeWork_1;

public class Main {
    public static void main(String[] args){
        HotDrinkMachine machine = new HotDrinkMachine();

        HotDrink coffee = machine.getProduct("Coffee",300, 85);
        HotDrink tea = machine.getProduct("Tea", 200,90);
    }
}
