package HomeworkSession7.Exercise8;

public class Shape {
    private int side1, side2, side3;

    public Shape(int sideLength) {
        this.side1 = sideLength;
    }

    public Shape(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Shape(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSideLength() {
        return side1;
    }

    public void setSideLength(int sideLength) {
        this.side1 = sideLength;
    }

    public int getPerimeter() {
        return side1 * 4;
    }

    public int getArea() {
        return side1 * side1;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }
}
