package ua.com.phoneBook.model.entity;

import java.util.LinkedList;
import java.util.List;

/**
* Created by danishevskyi on 8/4/17.
*/
public class ListContacts {

    private List<Contact> contacts;

    public ListContacts() {
        contacts = new LinkedList<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "ListContacts{" +
                "contacts=" + contacts +
                '}';
    }
}
