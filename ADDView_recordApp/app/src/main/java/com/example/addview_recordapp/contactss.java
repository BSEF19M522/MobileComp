package com.example.addview_recordapp;

import androidx.annotation.NonNull;

public class contactss {
    private String Name;
    private int PhoneNumber;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public contactss(String name, int phoneNumber) {
        Name = name;
        PhoneNumber = phoneNumber;
    }

    @NonNull
    @Override
    public String toString() {

            return "contactss{" + "Name='" + Name + '\'' + ", PhoneNumber=" + PhoneNumber + '}';
        }
        
    }
}
