package com.addressbook;

import java.util.Scanner;

public class AddressBookMain extends AddressBook {

    public void anyUpdateInAddressBook() {
        Scanner sc = new Scanner(System.in);

        boolean exit = true;
        while (exit) {
            System.out.println("Select any option \n" +
                    "1 For Add person data \n" +
                    "2 For Display Data \n" +
                    "3 For Edit person data \n" +
                    "4 For Exit \n");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    addContactDetails();
                    break;
                case 2:
                    displayPersonDetails();
                    break;
                case 3:
                    editExistingContact();
                    break;
                case 4:
                    exit = false;
                    System.out.println("You are successfully exit");
                    break;
                default:
                    System.out.println("Enter wrong number. Enter again.");
            }
        }
    }

    public static void main(String[] args) {
        AddressBookMain addressBookMainObj = new AddressBookMain();
        addressBookMainObj.anyUpdateInAddressBook();
    }
}
