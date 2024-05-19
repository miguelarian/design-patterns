package com.miguelvela;

public class UserApiProxy implements UsersApi {

    private UsersApiClient usersApi;
    private int requestCounter;

    public UserApiProxy() {
        this.usersApi = new UsersApiClient();
        this.requestCounter = 0;
    }

    @Override
    public User[] getUsers() {
        this.requestCounter++;
        return this.usersApi.getUsers();
    }

    @Override
    public User getUsers(int userId) {
        this.requestCounter++;
        return this.usersApi.getUsers(userId);
    }

    public int getRequestCounter() {
        return this.requestCounter;
    }
}
