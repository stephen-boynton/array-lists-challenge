package com.stephenboynton;

/**
 * Created by stephenboynton on 7/2/17.
 */
public class MobilePhone {

    Contacts contacts = new Contacts();

    public void addContact (String contact) {
        contacts.addContact(contact);
    }

    public void removeContact (String contact) {
        contacts.removeContact(contact);
    }

    public void modifyContact (String old, String newContact) {
        contacts.updateContact(old, newContact);
    }

    public void search (String contact) {
        contacts.searchContacts(contact);
    }

    public void displayContacts () {
        contacts.displayContacts();
    }

}
