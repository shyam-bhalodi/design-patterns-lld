package StrategyDesignPattern.withoutStrategy;

public class SportsVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("special drive");
    }
}
