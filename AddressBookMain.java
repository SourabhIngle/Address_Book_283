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
                    "4 For Delete person data \n" +
                    "5 For Exit \n");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Enter how many person do you want to add: ");
                    int num = sc.nextInt();
                    for (int i = 0; i < num; i++) {
                        addContactDetails();
                    }
                    break;
                case 2:
                    displayPersonDetails();
                    break;
                case 3:
                    editExistingContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
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
