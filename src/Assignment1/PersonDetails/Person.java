package Assignment1.PersonDetails;

public class Person {
    private String firstName = "";
    private String lastName = "";
    private String[] numberList;
    private String emailAddress = "";

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
