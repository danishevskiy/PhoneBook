package ua.com.phoneBook.model.entity;

import ua.com.phoneBook.model.enums.Group;

import java.util.Date;

/**
 * Created by denystymoshkevych on 8/4/17.
 */
public class Contact {

    private String surename;
    private String name;
    private String fullName;
    private String login;
    private String comment;
    private Group group;
    private String mobilePhone;
    private String phone;
    private String phone2;
    private String email;
    private String skype;
    private Address address;
    private Date dateCreate;
    private Date dateUpdate;

    public Contact() {
    }


    public Contact(String surename, String name, String fullName, String login, String comment, Group group, String mobilePhone, String phone, String phone2, String email, /*String skype,*/ Address address) {
        this.surename = surename;
        this.name = name;
        this.fullName = fullName;
        this.login = login;
        this.comment = comment;
        this.group = group;
        this.mobilePhone = mobilePhone;
        this.phone = phone;
        this.phone2 = phone2;
        this.email = email;
        /*this.skype = skype;*/
        this.address = address;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    /*public StringBuilder getComment() {
        return comment;
    }

    public void setComment(StringBuilder comment) {
        this.comment = comment;
    }*/

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "surename='" + surename + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", login='" + login + '\'' +
                ", comment=" + comment +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", phone='" + phone + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                ", dateCreate=" + dateCreate +
                ", dateUpdate=" + dateUpdate +
                '}';
    }

    public String toStringFullName() {
        return "Contact{" +
                "surename='" + surename + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
