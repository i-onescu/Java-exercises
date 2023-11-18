package HomeworkSession7.Exercise6;

public class Vehicle {
    protected String make, model, fuelType;
    protected int year, maxSpeed;
    private final String[] fuelList = {"DIESEL", "GASOLINE"};

    public Vehicle(String make, String model, String fuelType, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public Vehicle(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        for (String fuel : fuelList)
            if (fuel.equals(fuelType.toUpperCase())) {
                this.fuelType = fuelType;
                break;
            }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void distanceDriven(double time, double speed) {
        double distance;
        distance = (speed * 5 / 18 * (time * 60)) / 1000;
        System.out.println("After driving for " + time + " minutes at a speed of " + speed + " you have traveled " + distance + " kilometers.");
    }

    public void fuelEfficiency() {
        System.out.println("Fuel Efficiency");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
