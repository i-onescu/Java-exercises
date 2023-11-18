package homework.src;


import java.util.Random;
import java.util.Scanner;

public class HomeworkSession4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //For the sake of simplicity I will be using this array for all the exercises needing one


        //1. Write a Java program to find the index of an array element.
        System.out.println("Input one of the previously shown array's elements: ");
        int arrayElement = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == arrayElement) {
                System.out.println("The position of the array element '" + arrayElement + "' is " + i);
                break;
            }
        }
        System.out.println(" ");

        //2. Write a Java program to copy an array by iterating the array.
        //   hint: Don't use Arrays.copyOf().
        System.out.println("The previous array will be copied into the array 'copyOfArray'");
        int[] copyOfArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyOfArray[i] = array[i];
        }
        System.out.print("Behold... copyOfArray: ");
        for (int i : copyOfArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //3. Write a Java program to insert an element (specific position) into an array.
        //   hint: create a new array with old array's length + 1 and insert the element on the required position.
        //   please print the elements of the new created array.
        System.out.println("Input a new array element and the position you would like it to adopt: ");
        int newArrayElement = scanner.nextInt();
        int newArrayElementPosition = scanner.nextInt();
        int[] newArray = new int[array.length + 1];
        for (int i = newArray.length - 1; i >= 0; i--) {
            if (i == newArrayElementPosition)
                newArray[i] = newArrayElement;
            else if (i > newArrayElementPosition)
                newArray[i] = array[i - 1];
            else newArray[i] = array[i];
        }
        System.out.print("Behold... The new array: ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //4. Write a Java program to find the maximum and minimum value of an array.
        int min = 100;        //Using 0 as min value since it is the random number generation's origin
        int max = 0;      //Using 100 as max value since it is where the random number generation is bound
        for (int value : array) {
            if (min > value)
                min = value;
            if (max < value)
                max = value;
        }

        System.out.print("Here is a refresher of our beloved array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("The maximum value in this array is " + max);
        System.out.println("The minimum value in this array is " + min);
        System.out.println("\n");

        //5. Write a Java program to reverse an array of integer values.
        int[] reverseArray = new int[array.length];
        int k = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[k] = array[i];
            k++;
        }
        System.out.println("This is a reversed version of our beloved array");
        for (int i : reverseArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //6. Write a Java program to find common elements between two integer arrays.
        int[] array1 = new int[20];
        int[] array2 = new int[20];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100);
            array2[i] = random.nextInt(100);
        }
        System.out.println("Array 1");
        for (int value : array1) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

        System.out.println("Array 2");
        for (int value : array2) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
        System.out.println("The common elements of Array 1 and Array2 are: ");
        for (int i : array1) {
            for (int j : array2) {
                if (j == i)
                    System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        //7. Write a Java program which stores in another array the even numbers from a given array.
        k = 0;
        for (int value : array) {
            if (value % 2 == 0)
                k++;
        }
        int[] evenNumArray = new int[k];
        k = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                evenNumArray[k] = value;
                k++;
            }
        }
        System.out.println("Here is ar array containing the even numbers of our beloved array:");
        for (int i : evenNumArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //8. Iterate and print each element from a matrix.
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] < 10)
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n");

        //For convenience, I will continue to use this matrix for all other exercises

        //9. Print the elements from the main diagonal in a matrix.
        System.out.println("Behold the elements from the main diagonal in out beloved matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j)
                    System.out.print(matrix[i][j]);
                System.out.print("   ");    //I was getting bored here
            }
            System.out.println();
        }
        System.out.println("\n");

        //10. Print the elements from the secondary diagonal in a matrix.
        System.out.println("Behold the elements from the secondary diagonal in out beloved matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j == matrix.length - 1)
                    System.out.print(matrix[i][j]);
                System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println("\n");

        //11. Print the sum of the elements above the main diagonal (all of them, not only the first 'semi-diagonal').
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i > j)
                    sum += matrix[i][j];
            }
        }
        System.out.println("The sum of the elements above the main diagonal is " + sum);
        System.out.println("\n");

        //12. Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
        //    Sorry dunno exactly what this is asking me to do. Will presume it is referring to the digits from within the array elements?
         k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0 && array[i] != 0) {
                k++;                        //Counting how many separate zeros we have to add to array
                array[i] = array[i] / 10;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i; j < array.length; j++) {
                    if (j != array.length - 1)
                        array[j] = array[j + 1];
                    else array[j] = 0;
                }
            }
        }
        int[] zeroArray = new int[array.length + k];
        for (int i = 0; i < array.length; i++) {
            zeroArray[i] = array[i];
        }
        System.out.println("""
                Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
                Sorry dunno exactly what this is asking me to do. Will presume it is referring to the digits from within the array elements?\s
                (Hopefully the first array generated will have some zeros in it so you don't have to run this program again) Here is the result\s
                """);
        for (int i : zeroArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Thank you for coming to my ted talk!");
    }
}
