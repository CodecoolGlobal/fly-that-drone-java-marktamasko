package com.codecool.ftd.logic;

import com.codecool.ftd.data.Position;

import java.util.Map;

public class MovementInterpreter {

    private final Map<String, Position> movements;

    private static final Map<String, Position> DEFAULT_MOVEMENT =
            Map.of(
                    "forward", new Position(1, 0, 0),
                    "backward", new Position(-1, 0, 0),
                    "right", new Position(0, 1, 0),
                    "left", new Position(0, -1, 0),
                    "forward-left", new Position(1, -1, 0),
                    "forward-right", new Position(1, 1, 0),
                    "backward-left", new Position(-1, -1, 0),
                    "backward-right", new Position(-1, 1, 0),
                    "up", new Position(0, 0, 1),
                    "down", new Position(0, 0, -1)
            );

    public MovementInterpreter() {
        this.movements = DEFAULT_MOVEMENT;
    }

    public Map<String, Position> getMovements() {
        return movements;
    }

    public Position interpretCommand(String command) {
        return this.movements.getOrDefault(command.toLowerCase(), new Position(0, 0, 0));
    }
}
