package com.example.demo.multithreading;

class A implements Runnable {

    @Override
    public void run() {
            System.out.println("Start Time "+System.currentTimeMillis());

        synchronized (A.class) {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        System.out.println("End Time "+System.currentTimeMillis());
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Thread a=new Thread(new A());
            a.start();
        }

    }
}
