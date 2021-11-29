package com.company;

public class Dog {
    private String sount;
    private int age;
    private boolean male;

    public Dog(String name, int age, boolean male) {
        this.sount = name;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return sount;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public Dog() {


    }
}
