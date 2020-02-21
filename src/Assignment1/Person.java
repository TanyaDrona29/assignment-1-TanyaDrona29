package Assignment1;

public class Person {
    private String firstName;
    private String lastName;
    private String[] numberList = new String[10];
    private String[] emailAddress = new String[10];
    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberList = numberList;
        this.emailAddress = emailAddress;
    }
    public String[] getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String[] emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String[] getNumberList() {
        return numberList;
    }

    public void setNumberList(String[] numberList) {
        this.numberList = numberList;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fristName) {
        this.firstName = firstName;
    }

}
