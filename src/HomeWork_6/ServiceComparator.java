package HomeWork_6;

import java.util.Comparator;
// Применяем SRP (Single Responsibility Principle).
// Ответственность этого класса - сравнивать обЪекты Teacher.
public class ServiceComparator implements Comparator<Teacher> {
    //Liskov Substitution Principle: метод способен работать с любым наследником Teacher без модификации.
    public int compare(Teacher s1, Teacher s2) {
        return s1.getFullName().compareTo(s2.getFullName());
    }
}