package Exercise6;

public class Car implements Drivable, Movable{

    @Override
    public void drive() {
        System.out.println("Driving car...");
    }

    @Override
    public void move() {
        System.out.println("Moving car...");
    }
}
