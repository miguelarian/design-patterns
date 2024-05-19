package com.miguelvela;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UserApiProxy userApiProxy = new UserApiProxy();

        User[] users = userApiProxy.getUsers();
        System.out.println("All users: ");
        Arrays.stream(users).forEach(user -> System.out.println(user));

        User mike = userApiProxy.getUsers(1);
        System.out.println("User with id 1: " + mike);

        User john  = userApiProxy.getUsers(2);
        System.out.println("User with id 2: " + john);

        User jane = userApiProxy.getUsers(3);
        System.out.println("User with id 3: " + jane);

        System.out.println("Requests counter: " + userApiProxy.getRequestCounter());
    }
}