package StrategyDesignPattern.withStrategy.Strategy;

public class NormalDrive implements Drive{
    @Override
    public void drive() {
        System.out.println("normal drive");
    }
}
