package com.miguelvela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> usersData = new ArrayList<>(Arrays.asList("Mike", "Robert", "Martin"));

        UserRepository database = new UserRepositoryImpl(usersData);
        RedisUserRepository redisCache = new RedisUserRepository(database);
        redisCache.addUser("Mike");

        redisCache.getUserByName("Robert");
        redisCache.getUserByName("Mike");
        redisCache.getUserByName("NotFound");
    }
}