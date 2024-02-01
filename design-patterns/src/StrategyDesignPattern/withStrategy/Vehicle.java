package StrategyDesignPattern.withStrategy;

import StrategyDesignPattern.withStrategy.Strategy.Drive;

public class Vehicle {
    Drive drive;
    Vehicle(Drive drive){
        this.drive=drive;
    }

    public void drive(){
        drive.drive();
    }
}
