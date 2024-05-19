package com.miguelvela;

import java.util.Arrays;

public class UsersApiClient implements UsersApi {

    private User[] users = new User[] {
            new User(1, "Mike"),
            new User(2, "John"),
            new User(3, "Jane"),
    };

    @Override
    public User[] getUsers() {
        return this.users;
    }

    @Override
    public User getUsers(int userId) {
        return Arrays.stream(users)
                    .filter(user -> user.id() == userId)
                    .findFirst()
                    .orElse(null);
    }
}
