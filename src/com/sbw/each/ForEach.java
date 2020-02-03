package com.sbw.each;

import java.util.ArrayList;

public class ForEach {
    private static ArrayList<User> users;
    public static void main(String[] args) {
        setData();

        users.forEach(item ->System.out.println(item.name+" "+item.age));
    }

    private static void setData() {
       users = new ArrayList<User>();
        users.add(new User("Sumanta", 32));
        users.add(new User("Binayak", 30));
        users.add(new User("Indranil", 31));
        users.add(new User("Surajit", 29));
        users.add(new User("Avijit", 32));
    }
}

class User{
    String name;
    int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
}
