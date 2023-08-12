package HomeWork4;

public class Main {
    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        printElement(5);  // Integer
        printElement("Привет");  // String
        printElement(3.55555);  // Double
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        String[] stringsArray = {"Привет!", "Как дела?"};

        printArray(integerArray);
        printArray(stringsArray);
    }
}


