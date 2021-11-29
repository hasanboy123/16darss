package com.company;

public class Person {
    private String name;
    private int age;
    private boolean male;
    private float height;

    public Person(String name, int age, boolean male, float height) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.height = height;
    }

    //устой конструк
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public float getHeight() {
        return height;
    }
}
