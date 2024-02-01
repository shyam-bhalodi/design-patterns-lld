package StrategyDesignPattern.withoutStrategy;

public class Offroadvehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("special drive");
    }
}
