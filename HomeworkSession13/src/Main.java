import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // 1. Define a generic class called Box that can hold an object of any type.
        //    Implement methods to set and get the value inside the box.

        // 2. Write a Java program to create a generic method that takes two arrays of the same type
        //    and checks if they have the same elements in the same order (pass different types).

        // 3. Write a Java program to create a generic method that takes a list of numbers and returns
        //    the sum of all the even and odd numbers.

        // 4. Write a Java program to create a generic method that takes a list of any type and returns it
        //    as a new list with the elements in reverse order.
    }

    static <T> boolean sameArray(T[] array1, T[] array2){
        if (array1.length != array2.length){
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])){
                return false;
            }
        }
        return true;
    }

    static <T extends Number> Pair<Integer> calculateSums(List<T> numbers){
        int evenSum = 0;
        int oddSum = 0;

        for (T number : numbers) {
            int value = number.intValue();
            if (value % 2 == 0){
                evenSum += value;
            } else {
                oddSum += value;
            }
        }
        return new Pair<>(evenSum,oddSum);
    }

}

class Pair<T> {
    T first, second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
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

class Box<T> {
    T object;

    public T getObject(){
        return object;
    }

    public void setObject(T object){
        this.object = object;
    }

}