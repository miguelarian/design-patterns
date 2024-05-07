package com.miguelvela;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {

    private List<String> database;

    public UserRepositoryImpl(List<String> data) {
        this.database = data;
    }

    @Override
    public String getUserByName(String name) {

        System.out.println("Searching in database: '" + name + "'");

        String result = this.database
                .stream()
                .filter(user -> user.equals(name))
                .findFirst()
                .orElse(null);

        System.out.println("Database result: '" + result + "'");

        return result;
    }
}
