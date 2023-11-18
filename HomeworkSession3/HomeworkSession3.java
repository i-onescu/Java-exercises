package homework.src;

import java.util.Scanner;

public class HomeworkSession3 {
    public static void main(String[] args) {
        int x, y, n;
        Scanner scanner = new Scanner(System.in);

        //1. Write a program to print numbers from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();


        //2. Write a program to calculate the sum of first 10 natural number.
        y = 0;  //sum stored in variable y
        for (int i = 1; i <= 10; i++) {
            y = y + i;
        }
        System.out.println("The sum of first 10 natural numbers is " + y);
        System.out.println();

        //3. Write a program to find the factorial value of any number entered through the keyboard.
        System.out.println("Input number to find its factorial value: ");
        x = scanner.nextInt();
        for (int i = 1; i <= x; i++) y = y * i; // !x stored in variable y
        System.out.println("The factorial value of " + x + " is " + y);
        System.out.println();

        //4. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int sum1, sum2;
        sum1 = sum2 = 0;
        int[] set = {22, 13, 7, 16, 83, 37, 52, 40};
        for (int i : set) {
            if (i == set[0])
                System.out.print("{" + i + ", ");
            else if (i == set[set.length - 1])
                System.out.print(i + "}\n");
            else System.out.print(i + ", ");
            if (i % 2 == 0)
                sum1 = sum1 + i;
            else sum2 = sum2 + i;
        }
        System.out.println("The sum of the even integers of the set is: " + sum1);
        System.out.println("The sum of the odd integers of the set is: " + sum2);
        System.out.println();

        //5. Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
        System.out.println("Input a positive integer so i can show you its multiplication table: ");
        x = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
        System.out.println();

        //6. Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
        System.out.println("Input 2 numbers to find the value of each one raised to the power of the other: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(x + " raised to the power of " + y + " is: " + powerOf(x, y));
        System.out.println("And " + y + " raised to the power of " + x + " is: " + powerOf(y, x));
        System.out.println();

        //7. Write a program to display a pattern like a right angle triangle with a number.
        //Example:
        //1
        //12
        //123
        //1234
        System.out.println("How many lines tall do you want this triangle to be?");
        x= scanner.nextInt();
        for (int i = 1; i <=x ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");  //space added because of aesthetic choices
            }
            System.out.println();
        }
        System.out.println();

        //8. Write a program that prints the product of the first n odd natural numbers.
        //Example:
        //1 * 2 * 3 etc...
        int p = 1 ;
        System.out.println("Input any natural number:");
        n = scanner.nextInt();
        for (int i = 1; i <= n * 2; i += 2) {
            p = p * i;
        }
        System.out.println("the product of the first " + n + " odd natural numbers is:" + p);
        System.out.println();

        //9. Write a program to make such a pattern like a right angle triangle with a number which will repeat a number in a row.
        //Example:
        //1
        //22
        //333
        //4444
        System.out.println("How many lines tall do you want this triangle to be?");
        x= scanner.nextInt();
        for (int i = 1; i <=x ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i + " ");  //space added because of aesthetic choices
            }
            System.out.println();
        }

        //10. Write a program that displays the first n square numbers and their sum.
        //Example: 1 4 9 16 etc...
        System.out.println("Input any natural number:");
        n = scanner.nextInt();
        int sum = 0;
        System.out.println("The first " + n + " squares are: ");
        for (int i = 1; i <= n; i++){
            sum = sum + powerOf(i,2);
            System.out.print(powerOf(i,2) + " ");
        }
        System.out.println("\nAnd their sum is " + sum);
        System.out.println();

        // 11. Write a program to check whether a given number is a 'Perfect' number or not.
        //The sum of its divisors is equal to the number itself excluding the number.
        System.out.println("Input any natural number: ");
        x = scanner.nextInt();
        int divSum = 1;
        for (int i = 2; i <= x/2; i++) {
            if(x % i == 0)
                divSum = divSum + i;
        }
        if(divSum == x)
            System.out.println(x + " is a perfect number!");
        else System.out.println(x + " is not a perfect number!");
        System.out.println();

        //12. Write a program to find the 'Perfect' numbers within a given number of ranges.
        System.out.println("Input minimum value in range: ");
        x = scanner.nextInt();
        System.out.println("Input maximum value in range: ");
        y = scanner.nextInt();
        System.out.println("The perfect numbers within {" + x + ", "+ y + "} are: ");
        for (int i = x; i <= y; i++) {
            divSum = 1;
            for (int j = 2; j <= i/2; j++) {
                if(i % j == 0)
                    divSum = divSum + j;
            }
            if(divSum == i)
                System.out.print(i + " ");
        }
        System.out.println();

        //13. Write a program to print Fibonacci series of n terms where n is input by user:
        System.out.println("Input any natural number: ");
        n = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println("The first " + n + " numbers of the Fibonacci sequence are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(n1 + " ");
            n1 = n1 + n2;
            n2 = n1 - n2;
        }


    }

    public static int powerOf(int number, int exponent) {  //method to extract the y power of x
        int power = number;
        while (exponent > 1) {
            power = power * number;
            exponent--;
        }
        return power;
    }
}
