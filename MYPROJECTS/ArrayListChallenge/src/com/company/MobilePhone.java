package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    Scanner scanner = new Scanner(System.in);

    private ArrayList<Contacts> contactsArrayList = new ArrayList<>();


    public void addContact() {


        Contacts newContact = new Contacts();



        contactsArrayList.add(newContact);
    }

    public void printContacts() {
        System.out.println("You have " + contactsArrayList.size() + " contacts");

        for (int i = 0; i < contactsArrayList.size(); i++) {

            Contacts contact = contactsArrayList.get(i);

            System.out.println((i + 1) + ". " + ( contact.getName() + ": " + contact.getNumber() ));
        }
    }

    public void updateContact( ) {
        System.out.println("Which contact would you like to update?");

       int position = findContact();
       Contacts updatedContact = contactsArrayList.get(position);
       if (position >=0){
           System.out.println("Editing contact: " + updatedContact.getName() + "\n" + "Enter new name");

           String newName = scanner.nextLine();

           updatedContact.setName(newName);

           System.out.println("Enter new number: " );

           String newNumber = scanner.nextLine();

           updatedContact.setNumber(newNumber);
       }


        System.out.println(updatedContact.getName() + "'s info has been updated. ");
    }

    public void removeContact( ){
        System.out.println("which contact would you like to delete?");


        int position = findContact();
        if (position >= 0){
            contactsArrayList.remove(position);
        }
    }
    public int findContact( ) {
        // System.out.println("WHICH CONTACT TO SEARCH: ");

        // update to search by number also

        String findContact = scanner.nextLine();

        for (int i = 0; i <= contactsArrayList.size()-1; i++) {

            Contacts compareContact = contactsArrayList.get(i);

            // System.out.println("findContact = " + findContact + "\n" + "compareContact.getName() = " + compareContact.getName() );

            if (findContact.equals(compareContact.getName())){
                System.out.println("Found contact: "  + compareContact.getName() + compareContact.getNumber());
                return contactsArrayList.indexOf(compareContact);

            }
        }
        System.out.println("contact not found");
        return -1;




    }

    public boolean onFile(String searchName){

        int position = findContact();
        if (position>=0 ){
            return true;
        }return false;
    }
}
