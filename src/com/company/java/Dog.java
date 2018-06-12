package com.company.java;

public class Dog extends Thread{
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Vau!!!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
