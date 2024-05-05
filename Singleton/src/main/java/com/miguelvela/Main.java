package com.miguelvela;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> data = Arrays.asList("Hello", "world!");
        // Database database = new Database(data); // Forbidden (private constructor)
        Database database = Database.getInstance(data);
        System.out.println(database);
    }
}