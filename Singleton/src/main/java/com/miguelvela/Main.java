package com.miguelvela;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("----- Single thread Database example -----");
        List<String> data = Arrays.asList("Hello", "world!");
        // Database database = new Database(data); // Forbidden (private constructor)
        Database database = Database.getInstance(data);
        System.out.println(database);

        System.out.println("----- Multithreaded Database example -----");
        Thread foo = new Thread(new ThreadFoo());
        Thread bar = new Thread(new ThreadBar());
        foo.start();
        bar.start();
    }

    private static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            List<String> data = Arrays.asList("Foo", "example");
            DatabaseMultithread database = DatabaseMultithread.getInstance(data);
            System.out.println(database);
        }
    }

    private static class ThreadBar implements Runnable {
        @Override
        public void run() {
            List<String> data = Arrays.asList("Bar", "example");
            DatabaseMultithread database = DatabaseMultithread.getInstance(data);
            System.out.println(database);
        }
    }
}