package ua.com.phoneBook.model.entity;

import java.util.List;

/**
 * Created by denystymoshkevych on 8/4/17.
 */
public class ListContacts {

    List<Contact> contacts;

    public ListContacts() {
    }

    public ListContacts(List<Contact> contacts) {
        this.contacts = contacts;
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
