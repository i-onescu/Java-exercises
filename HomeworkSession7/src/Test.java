package HomeworkSession7;


import HomeworkSession7.Exercise1And2.Circle;
import HomeworkSession7.Exercise1And2.Rectangle;
import HomeworkSession7.Exercise3.Dog;
import HomeworkSession7.Exercise4.Car;
import HomeworkSession7.Exercise5.BankAccount;
import HomeworkSession7.Exercise5.SavingsAccount;

public class Test {
    public static void main(String[] args) {

        //1. Write a Java program to create a class called Rectangle with private instance variables length and width.
        //   Provide public getter and setter methods to access and modify these variables.
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println("Rectangle has a width of " + rectangle.getWidth() + " and a length of " + rectangle.getLength());
        rectangle.setLength(5);
        rectangle.setWidth(7);
        System.out.println("Rectangle has a new width of " + rectangle.getWidth() + " and a new length of " + rectangle.getLength());

        //2. Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
        //   you can use Math.PI for the area and perimeter.
        Circle circle = new Circle(5);
        System.out.println("The circle with a radius of " + circle.getRadius() + " has a perimeter of " +
                circle.getPerimeter() + " and an area of " + circle.getArea());

        //3. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Dog that overrides the makeSound() method to bark.
        //   Animal can print "animal makes sound"
        //   Dog can print "barking..."
        Dog dog = new Dog();
        dog.makeSound();

        //4. Write a Java program to create a class called Vehicle with a method called drive().
        //   Create a subclass called Car that overrides the drive() method to print "Driving a car".
        Car car = new Car();
        car.drive();

        //5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
        //   Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
        BankAccount account = new BankAccount(500);
        System.out.println("The current account balance is " + account.getBalance());
        account.withdraw(401);
        System.out.println("The new account balance is " + account.getBalance());
        SavingsAccount account1 = new SavingsAccount(500);
        System.out.println("The current savings account balance is " + account1.getBalance());
        account1.withdraw(401);
        System.out.println("The new savings account balance is " + account1.getBalance());

        //6. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
        //   Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled,
        //   and maximum speed.





    }
}
