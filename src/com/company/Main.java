package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat ("myov myov",12,true);
        System.out.println(cat.getName());
        Dog dog = new Dog("wow wow",14,true);
        System.out.println(dog.getName());
        Cow cow = new Cow("mooo mooo",15,true);
        System.out.println(cow.getName());

    }
}
