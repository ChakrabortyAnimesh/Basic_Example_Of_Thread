package com.company.java;

public class Cat extends Thread{

    public void run(){
        for (int i = 0; i <3 ; i++) {
            System.out.println("Mau!!!");
            try {
                Thread.sleep(2000);
            }
                catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
