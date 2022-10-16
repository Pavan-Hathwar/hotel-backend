package com.example.hotelbackend.modal;

public class SignInData {
    String name;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SignInData(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public SignInData(){

    }
}
