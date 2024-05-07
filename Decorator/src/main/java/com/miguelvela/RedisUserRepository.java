package com.miguelvela;

import java.util.ArrayList;
import java.util.List;

public class RedisUserRepository extends UserRepositoryDecorator {

    private List<String> redisData;

    public RedisUserRepository(UserRepository userRepository) {
        super(userRepository);
        this.redisData = new ArrayList<>();
    }

    public void addUser(String name) {
        this.redisData.add(name);
    }

    @Override
    public String getUserByName(String name) {

        System.out.println("Searching in redis: '" + name + "'");

        String cachedUser = this.redisData
                                .stream()
                                .filter(user -> user.equals(name))
                                .findFirst()
                                .orElse(null);

        System.out.println("Redis result: '" + cachedUser + "'");

        if(cachedUser != null) {
            return cachedUser;
        }

        return super.getUserByName(name);
    }
}
