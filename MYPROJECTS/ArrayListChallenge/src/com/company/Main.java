package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        MobilePhone myPhone = new MobilePhone();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int choice = 0;


        while (!quit) {
            printInstructions();

            System.out.println("Enter Your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    myPhone.addContact();
                    break;
                case 3:
                    myPhone.updateContact();
                    break;
                case 4:
                    myPhone.removeContact();
                    break;
                case 5:
                    System.out.println("Enter contact to search for: ");
                    myPhone.findContact();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    printInstructions();
                    break;
            }
        }


    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To modify a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
}


