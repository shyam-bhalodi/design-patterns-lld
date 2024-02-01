package StrategyDesignPattern.withStrategy;

import StrategyDesignPattern.withStrategy.Strategy.Drive;
import StrategyDesignPattern.withStrategy.Strategy.SpecialDrive;

public class OffroadVehicle extends Vehicle{

    public OffroadVehicle() {
        super(new SpecialDrive());
    }
}
