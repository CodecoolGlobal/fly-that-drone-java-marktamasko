package com.codecool.ftd.logic;

import com.codecool.ftd.logic.directions.*;

import java.util.HashMap;
import java.util.Map;

public class MovementProvider {

    private final Map<String, MovementLogic> movements;

    public MovementProvider() {
        this.movements = new HashMap<>();
        this.movements.put("forward", new ForwardMovement());
        this.movements.put("forward-right", new ForwardRightMovement());
        this.movements.put("forward-left", new ForwardLeftMovement());
        this.movements.put("backward", new BackwardMovement());
        this.movements.put("backward-right", new BackwardRightMovement());
        this.movements.put("backward-left", new BackwardLeftMovement());
        this.movements.put("right", new RightMovement());
        this.movements.put("left", new LeftMovement());
        this.movements.put("up", new UpMovement());
        this.movements.put("down", new DownMovement());
    }

    public Map<String, MovementLogic> getMovements() {
        return movements;
    }
}
