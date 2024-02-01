package StrategyDesignPattern.withStrategy;

import StrategyDesignPattern.withStrategy.Strategy.Drive;
import StrategyDesignPattern.withStrategy.Strategy.NormalDrive;
import StrategyDesignPattern.withStrategy.Strategy.SpecialDrive;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
