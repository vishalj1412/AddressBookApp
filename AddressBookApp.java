package org.example;
import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("Welcome To Address Book");
        System.out.println("***********************************************");
        AddressBookApp appAddressBook = new AddressBookApp();
        System.out.println(appAddressBook.createContact());
    }

    private Contacts createContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter ZipCode: ");
        String zipcode = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String number = scanner.nextLine();

        System.out.print("Enter Email id: ");
        String email = scanner.nextLine();

        return new Contacts(firstName, lastName, address, city, state, zipcode, number, email);

    }
}
