package Assignment1.PersonDetails;

public class Person {
    private static String firstName = "";
    private static String lastName = "";
    private static String emailAddress = "";
    private static String[] numberList ;
    public Person(String firstName,String lastName, String emailAddress,String[] numberList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.numberList = numberList;
    }

    public static String[] getNumberList() {
        return numberList;
    }

    public static void setNumberList(String[] numberList) {
        Person.numberList = numberList;
    }

    public static String getEmailAddress() {
        return emailAddress;
    }

    public static void setEmailAddress(String emailAddress) {
        Person.emailAddress = emailAddress;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Person.lastName = lastName;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Person.firstName = firstName;
    }
}
