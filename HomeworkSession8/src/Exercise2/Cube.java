package Exercise2;

public class Cube extends Shape3D {

    private final int sideLength;

    public Cube(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateVolume() {
        return sideLength * sideLength * sideLength;
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * sideLength * sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

}
