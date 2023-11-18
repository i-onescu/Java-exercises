import Exercise2.Cube;
import Exercise2.Sphere;
import Exercise3.Square;
import Exercise3.Triangle;
import Exercise4.Circle;
import Exercise4.Rectangle;
import Exercise6.Car;
import Exercise8.Dog;

public class Main {
    public static void main(String[] args) {


//        1. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
//           Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the
//           respective methods to handle deposits and withdrawals for each account type.
//           For example, for SavingsAccount should not allow the user to withdraw if the balance is less than 100.


//        2. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea().
//           Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume
//           and surface area of each shape.


        Sphere sphere = new Sphere(5);
        double volume = sphere.calculateVolume();
        double surfaceArea = sphere.calculateSurfaceArea();
        System.out.println(volume + " " + surfaceArea);

        Cube cube = new Cube(5);
        volume = cube.calculateVolume();
        surfaceArea = cube.calculateSurfaceArea();
        System.out.println(volume + " " + surfaceArea);


//        3. Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter().
//           Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to
//           calculate the area and perimeter of each shape.


        Square square = new Square(5);
        System.out.println(square.area() + " " + square.perimeter());

        Triangle triangle = new Triangle(4,5,6);
        System.out.println(triangle.area() + " " + triangle.perimeter());


//        4. Write a Java program to create an interface Shape with the getArea() method.
//           Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
//           Implement the getArea() method for each of the three classes.


        Exercise4.Triangle triangle1 = new Exercise4.Triangle(4,5,6);
        Rectangle rectangle = new Rectangle(5,6);
        Circle circle = new Circle(5);
        System.out.println("Area of triangle is " + triangle1.getArea());
        System.out.println("Area of rectangle is " + rectangle.getArea());
        System.out.println("Area of circle is " + circle.getArea());

//
//        5. Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized.
//           Create a class Rectangle that implements the Resizable interface and implements the resize methods.


//        6. Create an interface Movable with a method void move(). Create a class Car that implements both the Drawable and Movable interfaces.
//           Demonstrate how the class can use methods from both interfaces.


        Car car = new Car();
        car.drive();
        car.move();


//        7. Define an interface Shape with methods double area() and double perimeter(). Create another interface Resizable with a method void resize(double factor).
//           Have a class Circle that implements both Shape and Resizable. Write code to demonstrate how you can use methods from both interfaces.


        Exercise7.Circle circle1 = new Exercise7.Circle(5);
        System.out.println("Circle initial radius " + circle1.getRadius() + " with area " + circle1.area() + " and perimeter " + circle1.perimeter());
        circle1.resize(1.5);
        System.out.println("Circle new radius " + circle1.getRadius() + " with area " + circle1.area() + " and perimeter " + circle1.perimeter());


//        8. Define an interface Animal with a method void speak(). Create an interface Mammal that extends the Animal interface and adds a method void walk().
//           Create a class Dog that implements the Mammal interface. Demonstrate how you can use methods from both interfaces in the Dog class.


        Dog doggo = new Dog();
        doggo.speak();
        doggo.walk();




    }
}