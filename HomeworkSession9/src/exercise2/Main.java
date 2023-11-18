package exercise2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Blue");
        Shape rectangle = new Rectangle(4,6, "Yellow");
        Shape circleBrother = new Circle(10, "Indigo");
        Shape rectangleBrother = new Rectangle(8,12, "Orange");
        Shape circleStranger = new Circle(7, "Red");

        Shape[] shapes = new Shape[] {circle, rectangle, circleBrother, rectangleBrother, circleStranger};

        //makes circles color filled and rectangles not filled
        for (Shape shape : shapes) {
            if (shape instanceof Circle){
                shape.setFilled(true);
            } else if (shape instanceof Rectangle){
                shape.setFilled(false);
            }
        }

        //I opted to do this without "if(shape instanceof ...)" because I realized that if the methods were already overwritten then I didn't necessarily need to
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Perimeter is " + shape.getPerimeter());
            System.out.println("Area is " + shape.getArea() + "\n");
        }

    }
}
