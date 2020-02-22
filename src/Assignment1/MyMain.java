package Assignment1;

import Assignment1.PersonDetails.Person;

import java.util.Scanner;

public class MyMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("you have choosen to add contact");
        System.out.println("please enter the person");
        System.out.print("First Name:");
        String first = scanner.nextLine();
        //person.setFirstName(first);
        System.out.print("last Name:");
        String last = scanner.nextLine();
        //person.setLastName(last);
        for (int i = 0; i <9; i++) {
            System.out.print("conctact Number:");
            String num = scanner.nextLine();
        }
        System.out.println("would you like to add another contact (y/n)");
        String choice1 = scanner.nextLine();
        if(choice1=="y"){
            System.out.print("Contact Number:");
            //String num2 =
            //person.setNumberList(num);
        }
        else{
            System.out.println("would you like to add an email address (y/n)");
          //  person.getEmailAddress();
        }
    }
}

