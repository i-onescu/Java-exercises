package homework.src;

import java.util.Scanner;

public class HomeworkSession1 {
    public static void main(String[] args)
    {
        double x, y;
        Scanner scanner = new Scanner(System.in);

        //1. Write a Java program to print 'Hello' on screen and your name on a separate line.
        System.out.println("Hello \n George \n");

        //2. Write a Java program to divide two numbers and print them on the screen.
        x = 6;
        y = 3;
        System.out.println("x = " + x + " y = " + y + "\nthe result of their division is " + x/y + "\n");

        //4. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
        System.out.println("Input temperature in degrees Fahrenheit:");
        x = scanner.nextDouble();   //temp in Fahrenheit stored in x
        y = ((x-32)*5)/9;   //converts Fahrenheit value into Celsius and stores value in y
        System.out.println(x + " degrees Fahrenheit is " + y + " degrees Celsius \n");

        //5. Write a Java program that reads a number in inches and converts it to meters.
        System.out.println("Input a length in inches:");
        x = scanner.nextDouble();   //length in inches stored in x
        y = x * .0254;  //converts inches to meters and stores value in y
        System.out.println(x + " inches is " + y + " meters \n");

        //6. Write a Java program that reads a number and displays the square, cube, and fourth power.
        //wrote a method powerOf to make things cleaner and for future use :)
        System.out.println("Input a number:");
        x = scanner.nextDouble();
        System.out.println("The square of " + x + " is " + powerOf(x,2));
        System.out.println("The cube of " + x + " is " + powerOf(x,3));
        System.out.println("The fourth power of " + x + " is " + powerOf(x,4));

        //7. Write a Java program to compute the body mass index (BMI).
        System.out.println("Input your weight in kg and height in cm (in that order): ");
        x = scanner.nextDouble();   //weight
        y = scanner.nextDouble();   //height
        System.out.println("Your body mass index is " + x/powerOf(y/100,2));

        //8. Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds),
        // and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
        System.out.println("Input distance (in meters) and time taken to travel said distance (in hours minutes and seconds): ");
        double distance = scanner.nextInt();
        double hours = scanner.nextInt();
        double minutes = scanner.nextInt();
        double seconds = scanner.nextInt();

        double metersPerSecond = distance/(hours * 3600 + minutes * 60 + seconds);
        double kilometersPerHour =metersPerSecond * 3600/1000;
        double milesPerHour = kilometersPerHour * 1/1.609;
        System.out.println("Speed in meters per second: " + metersPerSecond);
        System.out.println("Speed in kilometers per hour: " + kilometersPerHour);
        System.out.println("Speed in miles per hour: " + milesPerHour);
    }

    public static double powerOf(double number, int exponent){  //method to extract the y power of x
        double power = number;
        while(exponent > 1){
            power = power * number;
            exponent--;
        }
        return power;
    }
}