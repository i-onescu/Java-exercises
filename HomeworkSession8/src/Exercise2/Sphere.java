package Exercise2;

public class Sphere extends Shape3D {
    private final int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4 * Math.PI * radius * radius * radius) / 3;
    }

    @Override
    public double calculateSurfaceArea() {
        return (4 * Math.PI * (radius * radius));
    }

    public int getRadius() {
        return radius;
    }
}
