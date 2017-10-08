package com.stephenboynton;

import java.util.ArrayList;

/**
 * Created by stephenboynton on 7/2/17.
 */
public class Contacts {

    private ArrayList<String> contactList = new ArrayList<>();

    public void addContact (String item) {
        //check to see if contact already exists
        if (contactList.contains(item)) {
            System.out.println("This contact already exists.");
        } else {
            //add contact
            contactList.add(item);
            System.out.println("Your contact " + item + " has been added.");
        }
    }

    public void updateContact (String item, String replaceWith) {
        if (contactList.contains(item)) {
           int updateItem = findIndex(item);
           contactList.add(updateItem, replaceWith);
           contactList.remove(item);
            System.out.println("Your contact " + item +  "has been updated with " + replaceWith + "." );
        } else {
            System.out.println("This contact does not exist.");
        }
    }

    public void removeContact (String item) {
        if (contactList.contains(item)) {
            int toRemove = findIndex(item);
            contactList.remove(toRemove);
            System.out.println("Your contact " + item + " has been removed. Good riddance.");
        } else {
            System.out.println("No such contact exists.");
        }
    }

    public void searchContacts (String item) {
        if (contactList.contains(item)) {
            System.out.println("Your contact " + item + " exists.");
        } else {
            System.out.println("No such contact exists.");
        }
    }

    public void displayContacts () {
        System.out.println("You have " + contactList.size() + " contacts.");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i +1) + " " + contactList.get(i));
        }
    }


    private int findIndex (String item) {
        return contactList.indexOf(item);
    }



}
