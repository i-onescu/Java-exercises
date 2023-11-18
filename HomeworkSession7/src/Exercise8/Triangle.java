package HomeworkSession7.Exercise8;

public class Triangle extends Shape {
    int side1, side2, side3;

    public Triangle(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }

    @Override
    public int getPerimeter() {
            return side1 + side2 + side3;
    }

    @Override
    public int getArea() {
        System.out.println("Area of triangle.");
        return 0;
    }
}
