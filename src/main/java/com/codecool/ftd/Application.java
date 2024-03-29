package com.codecool.ftd;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;
import com.codecool.ftd.logic.MovementEngine;
import com.codecool.ftd.logic.MovementInterpreter;
import com.codecool.ftd.logic.MovementProvider;
import com.codecool.ftd.ui.FlyThatDroneUi;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Position startingPosition = new Position(0, 0, 0);
        Drone drone = new Drone(startingPosition);
        MovementProvider provider = new MovementProvider();
        MovementInterpreter interpreter = new MovementInterpreter(provider);
        MovementEngine movementEngine = new MovementEngine(interpreter);
        Scanner scanner = new Scanner(System.in);
        FlyThatDroneUi flyThatDroneUi = new FlyThatDroneUi(drone, movementEngine, scanner);
        flyThatDroneUi.start();
    }
}
