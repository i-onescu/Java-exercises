package HomeworkSession7.Exercise8;

public class Circle extends Shape{
    int radius;

    public Circle(int radius){
        super(radius);
    }

    public int getArea(){
        return (int) (Math.PI * radius * radius);
    }

    public int getPerimeter(){
        return (int) (2 * Math.PI * radius);
    }


}
