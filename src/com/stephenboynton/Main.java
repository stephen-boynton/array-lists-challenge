package com.stephenboynton;

import java.util.Scanner;

/**
 * Created by stephenboynton on 7/2/17.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone iPhone = new MobilePhone();

    public static void main (String[] args) {

        boolean quit = false;
        int choice;
        System.out.println("Welcome to your iPhone 1980s Edition. \n" +
                "Please select an option for your contacts: \n");
        while(!quit) {
            printInstructions();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    displayContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

        public static void printInstructions () {

            System.out.println("\n Press");
            System.out.println("\t 0 - Print choice options.");
            System.out.println("\t 1 - Print contact list items.");
            System.out.println("\t 2 - Add contact to the list.");
            System.out.println("\t 3 - Modify a contact.");
            System.out.println("\t 4 - Remove a contact.");
            System.out.println("\t 5 - Search for a contact.");
            System.out.println("\t 6 - Quit the program.");

    }

    public static void displayContact() {
        iPhone.displayContacts();
    }

    public static void addContact () {
        System.out.println("Who would you like to add? ");
        String contact = scanner.nextLine();
        iPhone.addContact(contact);
    }

    public static void modifyContact () {
        System.out.println("What contact would you like to modify: ");
        String old = scanner.nextLine();
        System.out.println("What would you like the contact to be updated to? ");
        String newContact = scanner.nextLine();
        iPhone.modifyContact(old, newContact);
    }

    public static void removeContact() {
        System.out.println("Who would you like to remove?  ");
        String remove = scanner.nextLine();
        iPhone.removeContact(remove);
    }

    public static void search() {
        System.out.println("Please enter your search term: ");
        String term = scanner.nextLine();
        iPhone.search(term);
    }



}
