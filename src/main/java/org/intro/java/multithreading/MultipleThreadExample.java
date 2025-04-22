package org.intro.java.multithreading;

public class MultipleThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread("thread1");
        Thread thread2 = new Thread("thread2");

        thread1.start();
        thread2.start();

        thread1.join();

        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
    }
}
