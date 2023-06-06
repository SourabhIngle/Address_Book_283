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


}
