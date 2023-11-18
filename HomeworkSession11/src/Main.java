import com.sun.source.tree.Tree;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        // 1. Write a Java program to iterate through all elements in a array list.
        ArrayList<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println();

        // 2. Write a Java program to insert an element into the array list at the first position.
        strings.add(0,"First");
        strings.forEach(System.out::println);

        System.out.println();


        // 3. Write a Java program to sort a given array list.
        strings.sort(String::compareTo);
        strings.forEach(System.out::println);

        System.out.println();

        // 4. Write a Java program to copy one array list into another.
        ArrayList<String> stringsCopy = new ArrayList<>(strings);
        stringsCopy.forEach(System.out::println);
        System.out.println();

        // 5. Write a Java program of swap two elements in an array list.
        String copyBin = new String();
        copyBin = stringsCopy.get(1);
        stringsCopy.set(1, stringsCopy.get(2));
        stringsCopy.set(2,copyBin);
        stringsCopy.forEach(System.out::println);
        System.out.println();

        // 6. Write a Java program to trim the capacity of an array list the current list size.
        stringsCopy.trimToSize();
        System.out.println();

        // 7. Write a Java program to empty an array list.
        strings.clear();
        System.out.println("Printing strings");
        strings.forEach(System.out::println);

        // 8. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("John");
        linkedList.add("Jodie");
        linkedList.add("Jill");
        linkedList.add("Jim");
        // chosen position is index 1
        for (int i = 1; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println();

        // 9. Write a Java program to iterate a linked list in reverse order.
        Iterator<String> reverseIterator = linkedList.descendingIterator();
        while (reverseIterator.hasNext()){
            System.out.println(reverseIterator.next());
        }
        System.out.println();

        // 10. Write a Java program to insert some elements at the specified position into a linked list.
        List<String> listToAdd = new ArrayList<>();
        listToAdd.add("Ron");
        listToAdd.add("Ronda");
        listToAdd.add("Ryan");
        linkedList.addAll(2,listToAdd);
        System.out.println(linkedList);

        // 11. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        linkedList.add("Ron");
        String specifiedElement = "Ron";
//        int lastOccurrenceIndex = 0;
//        boolean isFirst = true;
//        for (int i = 0; i < linkedList.size(); i++) {
//            if (linkedList.get(i).equals(specifiedElement)){
//                if (isFirst){
//                    isFirst = false;
//                    System.out.println("First occurrence of " + specifiedElement + " found on index "
//                            + i);
//                } else {
//                    lastOccurrenceIndex = i;
//                }
//            }
//        }
//        System.out.println("Last occurrence of " + specifiedElement + " found on index " + lastOccurrenceIndex);
        //                  /\
        //                 /  \
        //                  ||
        //                  ||
        //Only after doing this did I realize that there are methods for this, too late to delete so here it is

        linkedList.indexOf(specifiedElement);
        linkedList.lastIndexOf(specifiedElement);
        System.out.println("Index of first occurrence of \"" + specifiedElement + "\" is "+ linkedList.indexOf(specifiedElement)
                + " and index of last occurrence is " + linkedList.lastIndexOf(specifiedElement));
        System.out.println();

        // 12. Write a Java program to join two linked lists.
        LinkedList<String> linkedListA = new LinkedList<>();
        LinkedList<String> linkedListB = new LinkedList<>();
        LinkedList<String> linkedListC = new LinkedList<>();

        linkedListA.add("alpha");
        linkedListB.add("beta");
        linkedListC.addAll(linkedListA);
        linkedListC.addAll(linkedListB);
        System.out.println(linkedListC);
        System.out.println();

        // 13. Write a Java program to clone a linked list to another linked list.
        LinkedList<String> linkedListD = new LinkedList<>();
        linkedListD.addAll((LinkedList)linkedListC.clone());


        // 14. Write a Java program to remove and return the first element of a linked list.
        System.out.println(linkedListD.pop());
        System.out.println();

        // 15. Write a Java program to retrieve but does not remove, the first element of a linked list.
        System.out.println(linkedListD.peek());
        System.out.println();

        // 16. Write a Java program to iterate through all elements in a hash set.
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Ronnie");
        myHashSet.add("Judd");
        myHashSet.add("Mark");
        Iterator<String> setIterator = myHashSet.iterator();
        while (setIterator.hasNext()){
            System.out.println(setIterator.next());
        }
        System.out.println();

        // 17. Write a Java program to test a hash set is empty or not.
        if (myHashSet.isEmpty()){
            System.out.println("Hash set is empty");
        } else {
            System.out.println("Hash set is not empty");
            System.out.println(myHashSet);
        }
        System.out.println();

        // 18. Write a Java program to convert a hash set to an array.
        String[] newArray = new String[myHashSet.size()];
        int i = 0;
        for (String s : myHashSet) {
            newArray[i] = s;
            i++;
        }

        for (String s : newArray) {
            System.out.println(s);
        }
        System.out.println();

        // 19. Write a Java program to convert a hash set to a List/ArrayList.
        ArrayList<String> copyOfMyHashSet = new ArrayList<>(myHashSet);
        copyOfMyHashSet.forEach(System.out::println);
        System.out.println();

        // 20. Write a Java program to compare two sets and retain elements which are same on both sets.
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();
        Set<Integer> commomElements = new HashSet<>();

        setOne.add(1);
        setOne.add(3);
        setOne.add(6);
        setOne.add(9);
        setOne.add(12);

        setTwo.add(1);
        setTwo.add(2);
        setTwo.add(4);
        setTwo.add(6);
        setTwo.add(12);

        for (Integer integer : setOne) {
            if (setTwo.contains(integer)){
                commomElements.add(integer);
            }
        }

        commomElements.forEach(System.out::println);

        // 21. Write a Java program to remove all elements from a hash set.
        myHashSet.clear();
        System.out.println("Statement myHashSet is empty is " + myHashSet.isEmpty());
        System.out.println();

        // 22. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<Integer> treeSetOne = new TreeSet<>();

        treeSetOne.add(34);
        treeSetOne.add(4);
        treeSetOne.add(65);
        treeSetOne.add(13);
        treeSetOne.add(2);
        treeSetOne.add(6);
        treeSetOne.add(1);

        TreeSet<Integer> treeSetTwo = new TreeSet<>();
        treeSetTwo.addAll(treeSetOne);

        // 23. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        Iterator<Integer> treeSetIterator = treeSetOne.descendingIterator();
        while (treeSetIterator.hasNext()){
            System.out.println(treeSetIterator.next());
        }
        System.out.println();

        // 24. Write a Java program to find the numbers less than 7 in a tree set.
        Iterator<Integer> treeSetIterator2 = treeSetTwo.iterator();
        ArrayList<Integer> elements = new ArrayList<>();
        while (treeSetIterator2.hasNext()){
            int integer = treeSetIterator2.next();
            if (integer < 7){
                elements.add(integer);
            }
        }
        elements.forEach(System.out::println);
        System.out.println();

        // 25. Write a Java program to get the element in a tree set which is less than or equal to the given element.
        elements.clear();
        int givenElement = 13;
        Iterator<Integer> newTreeSetIterator = treeSetTwo.iterator();

        while (newTreeSetIterator.hasNext()){
            int next = newTreeSetIterator.next();
            if (next <= givenElement){
                elements.add(next);
            }
        }
        elements.forEach(System.out::println);
        System.out.println();

        // 26. Write a Java program to retrieve and remove the first element of a tree set.
        Integer firstElement = treeSetTwo.pollFirst();

        System.out.println("First element of TreeSet is " + firstElement);
        System.out.println();

        // 27. Write a Java program to retrieve and remove the last element of a tree set.
        Integer lastELement = treeSetTwo.pollLast();

        System.out.println("Last element of TreeSet is " + lastELement);
        System.out.println();

        // 28. Write a Java program to copy all of the mappings from the specified map to another map.
        HashMap<String,Integer> hashMap1 = new HashMap<>();
        hashMap1.put("One",1);
        hashMap1.put("Two",2);
        hashMap1.put("Three",3);
        hashMap1.put("Four",4);

        HashMap<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.putAll(hashMap1);

        System.out.println("HashMap1 is " + hashMap1 + " and HashMap2 is " + hashMap2);
        System.out.println();

        // 29. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        if (hashMap1.isEmpty()){
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap is not empty " + hashMap1);
        }
        System.out.println();

        // 30. Write a Java program to test if a map contains a mapping for the specified key.
        if (hashMap1.containsKey("Two")){
            System.out.println("Map contains a mapping for the specified key.");
        } else {
            System.out.println("Map does not contain a mapping for the specified key.");
        }
        System.out.println();

        // 31. Write a Java program to test if a map contains a mapping for the specified value.
        if (hashMap1.containsValue(2)){
            System.out.println("Map contains a mapping for the specified value.");
        } else {
            System.out.println("Map does not contain a mapping for the specified value.");
        }
        System.out.println();

        // 32. Write a Java program to sort keys in Tree Map by using comparator.
        TreeMap<String,Double> studentGradesMap = new TreeMap<>(new KeyComparator());   //Comparator sorts by alphabetical order
        studentGradesMap.put("George",9.5);
        studentGradesMap.put("Ionel",9.4);
        studentGradesMap.put("Grigore",10D);
        studentGradesMap.put("Andrei",7.8);
        studentGradesMap.put("Zalomit",6.4);
        System.out.println(studentGradesMap);
        System.out.println();

        // 33. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
        TreeMap<Integer,String> employees = new TreeMap<>();
        employees.put(123,"Jerry");
        employees.put(234,"George");
        employees.put(432,"Kramer");
        employees.put(100,"Elaine");
        System.out.println("Key-value mapping for greatest key in map is " + employees.firstEntry() + " and the key-value mapping for the least key in map is " + employees.lastEntry());
        System.out.println();

        // 34. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
        System.out.println(employees);
        System.out.println("First key in the map currently is " + employees.firstKey());
        System.out.println("Last key in the map currently is " + employees.lastKey());
        System.out.println();

        // 35. Write a Java program to get a reverse order view of the keys contained in a given map.
        System.out.println(employees.descendingMap());
        System.out.println();

        // 36. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
        int givenKey = 234;
        System.out.println(employees.lowerEntry(givenKey));
        System.out.println();

        // 37. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
        Map<Integer, String> portionMap = employees.headMap(givenKey);
        System.out.println(portionMap);
        System.out.println();

        // 38. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
        Map.Entry<Integer,String> myEntry = employees.lowerEntry(234);

        if (myEntry != null){
            System.out.println("Key-value mapping associated with the greatest key strictly less than the given key is " + myEntry);
        } else {
            System.out.println((String) null);
        }
        System.out.println();

        // 39. Write a Java program to iterate through any kind of map using keySet().
        Set<Integer> employeeKeySet = employees.keySet();

        for (Integer key : employeeKeySet) {
            System.out.println(employees.get(key));
        }
        System.out.println();

        // 40. Write a Java program to iterate through any kind of map using entrySet().
        Set<Map.Entry<Integer,String>> employeeEntrySet = employees.entrySet();
        for (Map.Entry<Integer, String> entry : employeeEntrySet) {
            System.out.println(entry);
        }
        System.out.println();

        // 41. Write a Java program to iterate through any kind of map using forEach().
        employees.forEach((integer,string) -> System.out.println("Key: " + integer + ", Value: " + string));


    }
    static class KeyComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}
