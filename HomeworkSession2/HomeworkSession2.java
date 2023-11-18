package homework.src;

import java.util.Scanner;

public class HomeworkSession2 {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);

        //1. Take the values of length and breadth of a rectangle from the user and check if it is square or not.
        System.out.print("Input length of rectangle: ");
        x = scanner.nextDouble();   //length
        System.out.print("\nInput breadth of rectangle: ");
        y = scanner.nextDouble();   //breadth
        if (x == y) System.out.println("\nIs a square!");
        else System.out.println("Is not a square!");

        //2. Write a Java program to check whether a given number is even or odd.
        System.out.print("Input value: ");
        x = scanner.nextDouble();
        if (x % 2 == 0)
            System.out.println("\nValue is even!");
        else System.out.println("\nValue is odd!");

        //3. Write a Java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
        //   hint: older than 18 yo.
        System.out.print("Input age of candidate: ");
        x = scanner.nextDouble();
        if (x >= 18)
            System.out.println("\nIs eligible to vote!");
        else System.out.println("\nIs not eligible to vote!");

        //4. Write a Java program to read the value of an integer m and display the value of n is 1 when m is larger than 0,
        //   0 when m is 0 and -1 when m is less than 0.
        //   hint: when m = -5; then n = -1; because m < 0;
        System.out.print("Input a value for int m: ");
        int m = scanner.nextInt();
        int n;
        if (m > 0) {
            n = 1;
        } else if (m < 0) {
            n = -1;
        } else {
            n = 0;
        }
        System.out.println("\nn is " + n);

        //6. Write a Java program to check whether a triangle is Equilateral, Isosceles or Scalene.
        System.out.println("Input the length values for the triangle's three sides: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && a == c)
            System.out.println("Triangle is equilateral!");
        else if (a == b || b == c || a == c)
            System.out.println("Triangle is isosceles!");
        else System.out.println("Triangle is scalene!");

        //7. Write a Java program to check whether a triangle can be formed with the given values for the angles.
        System.out.println("Input 3 angle values and see if a triangle can be formed with these angles: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a + b + c == 180)
            System.out.println("A triangle can indeed be formed with these 3 angles!");
        else System.out.println("A triangle cannot be formed with these 3 angles!");

        //9. Write a Java program to check whether a character is an alphabet, digit or special character.
        System.out.print("Input a character: ");
        char character = scanner.next().charAt(0);
        if (character > 47 && character < 58)
            System.out.println("Character is a digit!");
        else if (character > 64 && character < 91 || character > 96 && character < 123)
            System.out.println("Character is a letter!");
        else System.out.println("Character is a special character!");

        //10. Write a Java program to read any day number in integer and display the day name in word format.

        whatDayIsIt();  // I made this program into a method in order for the user to be able to
        // input a dayNumber value once more if the previous one was invalid
        // without having to rerun the program again and again

        //11. Write a program in Java to read any digit and display it in the word.

        spellDigit();   // I made this method for the same reasons as with exercise 10

        //12. Write a program in Java which is a Menu-Driven Program to perform a simple calculation.

        calculator();   //same thing here...


    }

    public static void whatDayIsIt() {
        System.out.println("Input a weekday number between 1 and 7: ");
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 1 -> System.out.println("It's Monday");
            case 2 -> System.out.println("It's Tuesday");
            case 3 -> System.out.println("It's Wednesday");
            case 4 -> System.out.println("It's Thursday");
            case 5 -> System.out.println("It's Friday");
            case 6 -> System.out.println("It's Saturday");
            case 7 -> System.out.println("It's Sunday");
            default -> {
                System.out.println("Invalid day number, please try again.");
                whatDayIsIt();
            }
        }
    }

    public static void spellDigit() {
        System.out.println("Input a digit (1-9): ");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        switch (digit) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            default -> {
                System.out.println("Invalid day number, please try again.");
                spellDigit();
            }
        }
    }

    public static void calculator() {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        x = scanner.nextDouble();
        System.out.println("Enter the second integer: ");
        y = scanner.nextDouble();
        System.out.printf("""
                Enter the operation you would like to go through with.
                Your options are:
                Addition ( + ).
                Subtraction( - ).
                Multiplication( * ).
                Division( / ).%n""");
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case '+' -> System.out.println("The addition of " + x + " and "
                    + y + " is: " + (x + y));
            case '-' -> System.out.println("The subtraction of " + y + " from "
                    + x + " is: " + (x - y));
            case '*' -> System.out.println("The multiplication of " + x + " and "
                    + y + " is: " + (x * y));
            case '/' -> System.out.println("The division of " + x + " by "
                    + y + " is: " + (x / y));
            default -> {
                System.out.println("Invalid operation, please try again.");
                calculator();
            }
        }
    }

}