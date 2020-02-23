package Assignment1.Execution;

import Assignment1.defination.DefinationList;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        String[] contactNumber;
        DefinationList definationList = new DefinationList();
        System.out.println("welcome to Tanya's Contact list");
        System.out.println("Press 1 to add new contact\n" +
                "Press 2 to view all contact details\n" +
                "Press 3 to search a contact in contact list\n" +
                "Press 4 to delete the contacts\n" +
                "Press 5 to exit from the menu option ");
        int option = scanner.nextInt();

    }
}
