package HomeworkSession7.Exercise6;

public class Test {
    public static void main(String[] args) {
        //6. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
        //   Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled,
        //   and maximum speed.
        Vehicle a = new Vehicle("diesel");
        System.out.println(a.getFuelType());
        a.setFuelType("gasoline");
        System.out.println(a.getFuelType());
        a.distanceDriven(60,50);


    }
}
