package com.miguelvela;

import java.util.List;

public abstract class UserRepositoryDecorator implements UserRepository {

    private UserRepository userRepository;

    public UserRepositoryDecorator(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String getUserByName(String name) {
        return this.userRepository.getUserByName(name);
    }
}
