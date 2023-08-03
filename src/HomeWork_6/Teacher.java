package HomeWork_6;
//Применяем SRP (Single Responsibility Principle).
//Этот класс отвечает только за хранение информации об учителе.
public class Teacher {
    private String firstName;
    private String middleName;
    private String lastName;
    public Teacher(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    //Getters для полей класса.
    //Encapsulation Principle: есть прямой доступ только к геттерам , но не к приватным полям.
    public String getFirstName () {

        return this.firstName;
    }
    public String getMiddleName () {
        return this.middleName;
    }
    public String getLastName () {
        return this.lastName;
    }
    public String getFullName () {
        //Combining fields to create f full name
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }
}
