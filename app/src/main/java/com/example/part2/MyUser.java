package com.example.part2;

import java.io.Serializable;

public class MyUser implements Serializable  {

    // private final String id ="13453468998";
    public   String id;
    private String name; // ماحدش يقدر يشوفة غير في الكلاس دا بس
    public String Email;
    public int Age;
    //Constructor
// ابعت فيه داتا
    // هو دالة اسمه بفي زي اسم الكلاس اللي هو فيه
    public MyUser(String id, String name, String Email, int Age) {
        this.id = id;
        this.name = name;
        this.Email = Email;
        this.Age = Age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void printUserData () {
        System.out.println("Name:" + this.name);
        System.out.println("Email:" + this.Email);
        System.out.println("Age:" + this.Age);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}