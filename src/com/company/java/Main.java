package com.company.java;

public class Main {

    public static void main(String[] args) {

        Cat cat=new Cat();
        Dog dog=new Dog();

        cat.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dog.start();




    }
}
