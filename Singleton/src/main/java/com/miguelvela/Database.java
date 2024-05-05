package com.miguelvela;

import java.util.List;

public class Database {
    private final List<String> data;
    private static Database instance;

    private Database(List<String> data) {
        this.data = data;
    }

    public static Database getInstance(List<String> data) {
        if(instance != null)
        {
            return  instance;
        }

        instance = new Database(data);
        return instance;
    }

    @Override
    public String toString() {
        return String.join(" ", this.data);
    }
}
