package HomeworkSession7.Exercise6;

public class Car extends Vehicle{

    private String make, model, fuelType;
    private int year;

    public Car(String make, String model, String fuelType, int year) {
        super(make, model, fuelType, year);
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("Car fuel efficiency");
    }

}
