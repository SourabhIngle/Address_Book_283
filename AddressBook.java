package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact contact;
    List<Contact> people = new ArrayList<>();

    public void displayPersonDetails() {
        System.out.println(people);
    }

    public void addContactDetails() {
        contact = new Contact();

        System.out.println("First Name");
        contact.setFirstName(sc.nextLine());

        System.out.println("Last Name");
        contact.setLastName(sc.nextLine());

        System.out.println("Address");
        contact.setAddress(sc.nextLine());

        System.out.println("City");
        contact.setCity(sc.nextLine());

        System.out.println("State");
        contact.setState(sc.nextLine());

        System.out.println("Email Id");
        contact.setEmail(sc.nextLine());

        System.out.println("Zip code");
        contact.setZip(sc.nextInt());

        System.out.println("Phone Number");
        contact.setPhoneNumber(sc.nextLong());

        people.add(contact);
        sc.nextLine();
    }

    public void editExistingContact() {

        System.out.println("Enter first and last name which person " +
                "you want to edit details");
        System.out.println("Enter first name : ");
        String fName = sc.nextLine();
        System.out.println("Enter last name : ");
        String lName = sc.nextLine();

        for (int i = 0; i < people.size(); i++) {
            contact = people.get(i);

            if (fName.equalsIgnoreCase(contact.getFirstName()) && lName.equalsIgnoreCase(contact.getLastName())) {
                System.out.println("You are edit this person data :\n" +
                        "First Name : " + contact.getFirstName() + "\n" +
                        "Last Name :" + contact.getLastName());

                boolean exit = true;
                while (exit) {
                    System.out.println("What do you want to edit select option :\n"
                            + "1.Address,   " + "2.City,   " + "3.State,   " + "4.Email Id,   "
                            + "5.Zip Code,   " + "6.Phone Number,   " + "7.exit");
                    int choice = sc.nextInt();sc.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.println("Address");
                            contact.setAddress(sc.nextLine());
                            System.out.println("Address update successfully");
                            break;
                        case 2:
                            System.out.println("City");
                            contact.setCity(sc.nextLine());
                            System.out.println("City update successfully");
                            break;
                        case 3:
                            System.out.println("State");
                            contact.setState(sc.nextLine());
                            System.out.println("State update successfully");
                            break;
                        case 4:
                            System.out.println("Email Id");
                            contact.setEmail(sc.nextLine());
                            System.out.println("Email Id update successfully");
                            break;
                        case 5:
                            System.out.println("Zip code");
                            contact.setZip(sc.nextInt());
                            System.out.println("Zip code update successfully");
                            break;
                        case 6:
                            System.out.println("Phone Number");
                            contact.setPhoneNumber(sc.nextLong());
                            System.out.println("Phone Number update successfully");
                            break;
                        case 7:
                            exit = false;
                            System.out.println("Exit successfully");
                            break;
                        default :
                            System.out.println("Wrong entry!");
                    }
                }
            }
        }
    }

    public void deleteContact() {
        System.out.println("Which contact do you want to delete: ");
        System.out.println("Enter first name : ");
        String fName = sc.nextLine();
        System.out.println("Enter last name : ");
        String lName = sc.nextLine();

        int count = 0;
        for (int i = 0; i < people.size(); i++) {

            contact = people.get(i);
            if (fName.equalsIgnoreCase(contact.getFirstName()) && lName.equalsIgnoreCase(contact.getLastName())) {
                contact = people.remove(i);
                count++;
                System.out.println("person removed successfully");
            }
        }
        if (count == 0)
            System.out.println("Match not found \n");
    }
}
