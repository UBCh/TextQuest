package com.example.textquest;

import lombok.Data;

import javax.inject.Singleton;

@Data
public class User {

    private static User INSTANCE;
    public int current=8;
    public String name="";
    public int level=0;
    public String idSession="";

    public User() {
    }

    public static User getInstance()  {
        if (INSTANCE == null) {
           INSTANCE = new User();
        }
        return INSTANCE;
    }


}
