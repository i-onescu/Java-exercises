package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> strings = new LinkedList<>();
        strings.add("Some element");
        strings.add("Another element");
        strings.add("Different element");

        // 7. Write a Java program to insert the specified element at the front of a linked list.
        System.out.println("\n7.");
        strings.addFirst("First element");
        strings.forEach(System.out::println);

        // 8. Write a Java program to insert the specified element at the end of a linked list.
        System.out.println("\n8.");
        strings.addLast("Last element");
        strings.forEach(System.out::println);

        // 9. Write a Java program to get the first and last occurrence of the specified elements in a linked list.






    }
}
