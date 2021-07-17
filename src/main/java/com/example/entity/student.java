package com.example.entity;

public class student {
    String firstName;
    String lastName;

    public student(){

    }
    public student(String fs, String ls){
        this.firstName=fs;
        this.lastName=ls;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
