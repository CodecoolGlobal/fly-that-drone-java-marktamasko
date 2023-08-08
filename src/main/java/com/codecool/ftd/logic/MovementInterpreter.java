package com.codecool.ftd.logic;

import com.codecool.ftd.data.Position;
import com.codecool.ftd.logic.directions.*;

import java.util.Set;

public class MovementInterpreter {

    private final MovementProvider provider;

    public MovementInterpreter(MovementProvider provider) {

        this.provider = provider;
    }

    public Set<String> getMovementProviderKeys() {
        return this.provider.getMovements().keySet();
    }

    public Position validateCommand(String command) {
        if (command == null) {
            System.out.println("Command is null");
            throw new IllegalArgumentException("Command can't be null");
        }
        MovementLogic logic = this.provider.getMovements().getOrDefault(command.toLowerCase(), new DefaultMovement());
        return logic.interpretCommand(command);
    }
}
