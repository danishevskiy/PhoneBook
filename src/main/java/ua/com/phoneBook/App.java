package ua.com.phoneBook;

import ua.com.phoneBook.controller.Controller;
import ua.com.phoneBook.model.entity.Contact;
import ua.com.phoneBook.view.Out;

import java.io.IOException;

/**
 * Created by danishevskyi on 8/4/17.
 */
public class App {

    public static void main(String[] args)  throws IOException {
        Contact contact = new Contact();
        Out out = new Out();
        Controller controller = new Controller(contact, out);

        controller.init();
    }
}
