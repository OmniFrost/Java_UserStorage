package com.izdeveloper.userstorageapp;

public class User {
    private String name, surname, email, degree;
    private int avatar;

    public User(String name, String surname, String email, String degree, int avatar) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.degree = degree;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public String getDegree() {
        return degree;
    }

    public int getAvatar() {
        return avatar;
    }
}
