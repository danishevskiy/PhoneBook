package ua.com.phoneBook.model.entity;

import java.util.Date;

/**
 * Created by danishevskyi on 8/4/17.
 */
public class Contact {

    private String name;
    private String surename;
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
        dateCreate = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getFullName() {
        return fullName;
    }

    public void createFullName() {
        if(surename.length() != 0 && name.length() != 0)
            this.fullName = surename + " " + name.charAt(0) + ".";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

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
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
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

}
