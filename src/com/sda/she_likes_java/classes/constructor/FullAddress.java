package com.sda.she_likes_java.classes.constructor;

public class FullAddress {
    public String country;
    public String city;
    public String street;
    // 02-987
    // 011
    public String postalCode;

    public FullAddress(String country, String city, String street, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }
//default constructor - without any parameters
    public FullAddress() {
    }

    @Override
    public String toString() {
        return "FullAddress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // full address
        FullAddress myAddress = new FullAddress();
        myAddress.city = "Vilnius";
        myAddress.country = "LT";
        myAddress.street = "Gedimino pr";
        myAddress.postalCode = "09769";
        System.out.println("FullAddress created by hand " + myAddress);

        FullAddress createdWithFullConstructor = new FullAddress ("Spain", "Barcelona","La Rambla","09879");
        System.out.println("FullAddress created with constructor " + createdWithFullConstructor);
    }
}
