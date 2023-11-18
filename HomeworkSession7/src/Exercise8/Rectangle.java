package HomeworkSession7.Exercise8;

public class Rectangle extends Shape {
    int width, length;

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int getArea() {
        return length * width;
    }

}
