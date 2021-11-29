package com.company;

public class Cow {
    private String sount;
    private int age;
    private boolean male;

    public Cow() {
    }

    public Cow(String name, int age, boolean male) {
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
}
