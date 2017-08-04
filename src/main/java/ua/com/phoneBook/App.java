package ua.com.phoneBook;

import ua.com.phoneBook.controller.Controller;
import ua.com.phoneBook.model.entity.Contact;
import ua.com.phoneBook.view.Out;

import java.io.IOException;

/**
 * Created by denystymoshkevych on 8/4/17.
 */
public class App {

    public static void main(String[] args) {
        Contact contact = new Contact();
        Out out = new Out();
        Controller controller = null;
        try {
            controller = new Controller(contact, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        controller.init();
    }
}
