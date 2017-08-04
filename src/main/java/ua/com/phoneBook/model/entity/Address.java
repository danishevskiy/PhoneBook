package ua.com.phoneBook.model.entity;

/**
 * Created by denystymoshkevych on 8/4/17.
 */
public class Address {

    private String city;
    private String street;
    private String house;
    private String zipCode;

    public Address() {
    }

    public Address(String city, String street, String house, String zipCode) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    public String toStringFullAddress() {
        return "Address: " + zipCode + ", " + city + ", " + street + ", " + house + ";";
    }
}
