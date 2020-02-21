package Assignment1;

public class Person {
    private String firstName;
    private String lastName;
    private String[] numberList = new String[10];
    private String[] emailAddress = new String[10];

    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.numberList = numberList;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer("------- * ------- * ------- * --------\n");
        stringBuffer.append("First Name: ").append(firstName).append("\n");
        stringBuffer.append("Last Name: ").append(lastName).append("\n");
        stringBuffer.append("Contact List: ").append(numberList).append("\n");
        stringBuffer.append("[");
        for (int i = 0; i <numberList.length; i++) {
            stringBuffer.append((numberList[i]!= null && i!= numberList.length ? numberList[i]:""));
            stringBuffer.append("]");
        }
        stringBuffer.append("\nemail=").append(emailAddress).append('\n');
        stringBuffer.append("------ * ------ * ------- * ------");
        return stringBuffer.toString();
    }
}
