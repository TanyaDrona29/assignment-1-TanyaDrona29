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

    public Person(String firstName, String lastName, String[] numberList, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberList = numberList;
        this.emailAddress = emailAddress;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("-------- * -------- * -------- * --------\n");
        sb.append("First Name: ").append(firstName).append('\n');
        sb.append("Last Name: ").append(lastName).append('\n');
        sb.append("Contact List: ").append(numberList);

        for (int i = 0; i < numberList.length; i++) {
            sb.append((numberList[i] != null && i != numberList.length ? numberList[i] : ""));

        }
        sb.append("\nemail='").append(emailAddress).append('\n');
        sb.append("-------- * -------- * -------- * --------");
        return sb.toString();
    }
}