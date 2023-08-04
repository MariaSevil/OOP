package HomeWork_4;

public class Service {
    private String firstName;
    private String middleName;
    private String lastName;
    public Service(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
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
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }
}


