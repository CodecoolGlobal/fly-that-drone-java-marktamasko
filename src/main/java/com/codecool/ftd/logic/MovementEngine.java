package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

import java.util.ArrayList;
import java.util.List;

public class MovementEngine {

    private final MovementInterpreter interpreter;

    public MovementEngine(MovementInterpreter interpreter) {
        this.interpreter = interpreter;
    }

    public void move(Drone drone, String command) {

        Position movement = this.interpreter.validateCommand(command);

        if (!movement.equals(new Position(0, 0, 0))) {
            Position currentPosition = drone.getPosition();
            Position newPosition = new Position(
                    currentPosition.x() + movement.x(),
                    currentPosition.y() + movement.y(),
                    currentPosition.z() + movement.z()
            );
            drone.setPosition(newPosition);
        } else {
            System.out.println("Invalid command! " + command);
            throw new IllegalArgumentException("Invalid command! " + command);
        }
    }

    public List<String> getCommands() {
        return new ArrayList<>(this.interpreter.getMovementProviderKeys());
    }
}
