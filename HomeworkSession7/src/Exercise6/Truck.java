package HomeworkSession7.Exercise6;

public class Truck extends Vehicle{

    private String make, model, fuelType;
    private int year;

    public Truck(String make, String model, String fuelType, int year) {
        super(make, model, fuelType, year);
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("Truck fuel efficiency");
    }

}
