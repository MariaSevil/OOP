package HomeWork_4;

import java.util.Comparator;

public class ServiceComparator<T extends Service> implements Comparator<T> {

    public int compare(T s1, T s2) {
        return s1.getFullName().compareTo(s2.getFullName());
    }
}