package com.miguelvela;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class CommandHistory {
    private final Deque<Command> commandsHistory = new ArrayDeque<>();

    public void push(Command command) {
        commandsHistory.push(command);
    }

    public Optional<Command> pop() {
        if (commandsHistory.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(commandsHistory.pop());
    }
}
