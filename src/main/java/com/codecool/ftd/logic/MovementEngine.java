package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MovementEngine {

    private static final Map<String, Position> MOVEMENT_OPTIONS =
            Map.of(
                    "forward", new Position(1, 0, 0),
                    "backward", new Position(-1, 0, 0),
                    "right", new Position(0, 1, 0),
                    "left", new Position(0, -1, 0)
            );

    public void move(Drone drone, String command) {
        Position currentPosition = drone.getPosition();
        Position movement = MOVEMENT_OPTIONS.get(command);

        if (movement != null) {
            Position newPosition = new Position(
                    currentPosition.x() + movement.x(),
                    currentPosition.y() + movement.y(),
                    currentPosition.z() + movement.z()
            );
            drone.setPosition(newPosition);
        } else {
            System.out.println("Invalid command");
        }
    }

    public List<String> getCommands() {
        return new ArrayList<>(MOVEMENT_OPTIONS.keySet());
    }
}
