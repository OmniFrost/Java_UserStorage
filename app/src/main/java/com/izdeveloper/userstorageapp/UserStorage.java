package com.izdeveloper.userstorageapp;

import java.util.ArrayList;

public class UserStorage {
    private static UserStorage single;
    private ArrayList<User> list;

    private UserStorage() {
        list = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return list;
    }
    public void addUser(User user) {
        list.add(user);
    }
    public static UserStorage getSingle() {
        if (single == null) {
            single = new UserStorage();
        }
        return single;
    }
}
