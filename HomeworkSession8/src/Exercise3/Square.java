package Exercise3;

public class Square extends GeometricShape {
    int sideLength;

    public Square(int sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public int perimeter() {
        return sideLength * 4;
    }
}
