import java.rmi.UnexpectedException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Define a generic class called Box that can hold an object of any type.
        //    Implement methods to set and get the value inside the box.
        List<String> someList = new ArrayList<>();
        someList.add("Thelonious Monk");
        someList.add("Miles Davis");
        someList.add("Charles Mingus");
        someList.add("John Coltrane");
        Box<List<String>> boxOne = new Box<>(someList);
        System.out.println(boxOne + "\n");

        // 2. Write a Java program to create a generic method that takes two arrays of the same type
        //    and checks if they have the same elements in the same order (pass different types).
        Integer[] integers1 = new Integer[]{1, 2, 3, 4};
        Integer[] integers2 = new Integer[]{1, 2, 3, 4};
        if (arraysEqual(integers1, integers1)){
            System.out.println("Arrays are equal \n");
        } else {
            System.out.println("Arrays are not equal \n");
        }

        // 3. Write a Java program to create a generic method that takes a list of numbers and returns
        //    the sum of all the even and odd numbers.
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(3);
        integerList.add(2);
        integerList.add(4);
        Pair<Integer> sums = new Pair<>(calculateSums(integerList));
        System.out.println("The sum of the even numbers is " + sums.getFirst() +
                " and the sum of the odd numbers is " + sums.getSecond() + "\n");

        // 4. Write a Java program to create a generic method that takes a list of any type and returns it
        //    as a new list with the elements in reverse order.
        List<String> originalList = new ArrayList<>();
        originalList.add("One");
        originalList.add("Two");
        originalList.add("Three");
        originalList.add("Four");
        originalList.add("Five");
        List<String> reversedList = new ArrayList<>(reverseList(originalList));
        System.out.println("Original list is " + originalList + " and the reversed list is " + reversedList + "\n");


        // 5. Write a generic method called printItems that takes a list of any type and prints each item.
        //    Use an upper bound to ensure that the list elements implement the CharSequence interface.

        // 6. Write a method called displayFirstTwo that takes a list of any type and displays the first two elements.
        // Use a wildcard in the method parameter.

        // 7. Create a generic class called Box that stores an item of any type. Implement methods to put an
        //    item into the box and retrieve it.
    }

    //-------------------------------- 4

    static <T> List<T> reverseList(List<T> originalList) {
        Iterator<T> iterator = originalList.listIterator();
        int size = originalList.size() - 1;
        List<T> reversedList = new ArrayList<>(size);
        for (int i = size; i >= 0; i--) {
            if (iterator.hasNext()) {
                T next = iterator.next();
                reversedList.set(i, next);
            } else {
                break;
            }
        }
        return reversedList;
    }

    //-------------------------------- 6

    static void displayFirstTwo(List<?> list) {
        int k = 0;
        for (Object o : list) {
            if (k < 2) {
                System.out.println(o);
                k++;
            } else {
                break;
            }
        }
    }

    //-------------------------------- 5

    static <T extends CharSequence> void printItems(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    //-------------------------------- 2

    static <T> boolean arraysEqual(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    //-------------------------------- 3

    static <T extends Number> Pair<Integer> calculateSums(List<T> numbers) {
        int evenSum = 0;
        int oddSum = 0;

        for (T number : numbers) {
            int value = number.intValue();
            if (value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }
        return new Pair<>(evenSum, oddSum);
    }
}

class Pair<T> {
    T first, second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public Pair(Pair<T> integerPair) {
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}

//-------------------------------- 1 & 7

class Box<T> {
    T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setOItem(T object) {
        this.item = object;
    }

    @Override
    public String toString() {
        return "Box{" +
                "Item=" + item +
                '}';
    }
}