package com.example.dbcrud;

public class contactss {
    private static String Name;
    private static  String PhoneNumber;

    public static String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public contactss(String name, String phoneNumber) {
        Name = name;
        PhoneNumber = phoneNumber;
    }


    @Override
    public String toString() {

            return "contactss{" + " Name='" + Name + '\'' + ", phoneNumber=" + PhoneNumber + '}';
        }


}
