package HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 10. Write a Java program to append the specified element to the end of a hash set.
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Bruce");
        names.add("Walter");
        System.out.println(names);

        // 11. Write a Java program to get the number of elements in a hash set.
        int nOfElements = names.size();
        System.out.println(nOfElements);

        // 12. Write a Java program to empty a hash set.
        names.clear();
        System.out.println(names);

        // 13. Write a Java program to convert a hash set to a List/ArrayList.
        names.add("John");
        names.add("Bruce");
        names.add("Walter");

        ArrayList<String> namesList = new ArrayList<>(names);
        namesList.forEach(System.out::println);

        System.out.println();

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.addAll(names);
        Iterator<String> iterator = namesArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        // 14. Write a Java program to clone a hash set to another hash set.
        HashSet<String> namesClone = new HashSet<>(names);

        namesClone.forEach(System.out::println);


    }
}
