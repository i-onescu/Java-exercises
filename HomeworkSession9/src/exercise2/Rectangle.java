package exercise2;

public class Rectangle extends Shape {
    double height, length;

    public Rectangle(double height, double length){
        this.height = height;
        this.length = length;
    }

    public Rectangle(double height, double length, String color){
        this.height = height;
        this.length = length;
        setColor(color);
    }

    @Override
    public double getPerimeter() {
        return height * 2 + length * 2;
    }

    @Override
    public double getArea() {
        return height * length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", length=" + length +
                ", color=" + getColor() +
                ", filled=" + isFilled() +
                '}';
    }
}
