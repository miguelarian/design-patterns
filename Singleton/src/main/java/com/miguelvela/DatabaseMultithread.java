package com.miguelvela;

import java.util.List;

public class DatabaseMultithread {
    private final List<String> data;
    private static volatile DatabaseMultithread instance;

    private DatabaseMultithread(List<String> data) {
        this.data = data;
    }

    public static DatabaseMultithread getInstance(List<String> data) {
        if(instance != null)
        {
            return  instance;
        }

        synchronized(DatabaseMultithread.class) {
            if (instance == null) {
                instance = new DatabaseMultithread(data);
            }
            return instance;
        }
    }

    @Override
    public String toString() {
        return String.join(" ", this.data);
    }
}
