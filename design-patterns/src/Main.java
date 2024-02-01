import StrategyDesignPattern.withStrategy.OffroadVehicle;
import StrategyDesignPattern.withStrategy.PassengerVehicle;
import StrategyDesignPattern.withStrategy.SportsVehicle;
import StrategyDesignPattern.withStrategy.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vehicle vehicle1 = new PassengerVehicle();
        Vehicle vehicle2 = new SportsVehicle();
        Vehicle vehicle3 = new OffroadVehicle();
        vehicle1.drive();
        vehicle2.drive();
        vehicle3.drive();

    }
}