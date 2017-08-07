package ua.com.phoneBook.controller;

import ua.com.phoneBook.model.entity.Address;
import ua.com.phoneBook.model.entity.Contact;
import ua.com.phoneBook.model.entity.Group;
import ua.com.phoneBook.view.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static ua.com.phoneBook.view.StaticWords.*;

/**
 * Created by danishevskyi on 8/4/17.
 */
public class Controller implements RegularExp{

    private Out out;
    private Contact contact;

    public Controller(Contact contact, Out out) throws IOException {
        this.contact = contact;
        this.out = out;
    }

    public void init() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Group group;
        Address address;

        contact.setName(createFieldMember(br, NAME, REG_NAME));
        contact.setSurename(createFieldMember(br, SURNAME, REG_NAME));
        contact.createFullName();
        contact.setLogin(createFieldMember(br, NICK_NAME, REG_LOGIN));
        contact.setComment(createFieldMember(br, COMMENT, REG_TEXT));
        contact.setGroup(group = new Group());
        try{
            group.setDescription(createFieldMember(br, GROUP, REG_TEXT));
        }catch (NumberFormatException e){
            out.printMessage(ERROR + CRASH);
            return;
        }
        contact.setMobilePhone(createFieldMember(br, PHONE, REG_PHONE));
        contact.setPhone(createFieldMember(br, CELL_PHONE_FIRST, REG_PHONE));
        contact.setPhone2(createFieldMember(br, CELL_PHONE_SECOND, REG_PHONE));
        contact.setEmail(createFieldMember(br, EMAIL, REG_EMAIL));
        contact.setSkype(createFieldMember(br, SKYPE, REG_LOGIN));
        contact.setAddress(address = new Address());
                address.setCity(createFieldMember(br, CITY, REG_TEXT));
                address.setStreet(createFieldMember(br, STREET, REG_TEXT));
                address.setHouse(createFieldMember(br, HOUSE, REG_TEXT));
                address.setZipCode(createFieldMember(br, ZIP_CODE, REG_ZIP_CODE));

        out.printMessage(contact.toString());
    }

    private String createFieldMember(BufferedReader br, String in, String regexp) throws IOException {
        out.printMessage(in);
        String input = br.readLine();

        while (!input.matches(regexp)) {
            out.printMessage(ERROR + in);
            input = br.readLine();
        }
        return input;
    }

}
