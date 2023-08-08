package com.codecool.ftd.logic.directions;

import com.codecool.ftd.data.Position;
import com.codecool.ftd.logic.MovementLogic;

public class DefaultMovement implements MovementLogic {

    @Override
    public Position interpretCommand(String command) {
        return new Position(0, 0, 0);
    }
}
