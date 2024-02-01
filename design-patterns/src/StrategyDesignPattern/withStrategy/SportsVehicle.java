package StrategyDesignPattern.withStrategy;

import StrategyDesignPattern.withStrategy.Strategy.Drive;
import StrategyDesignPattern.withStrategy.Strategy.SpecialDrive;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SpecialDrive());
    }
}
