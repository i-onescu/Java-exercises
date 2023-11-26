import company.*;
import products.Category;
import products.Product;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


//         1. Given a list of integers, create a new list that contains only the even numbers.
//            Use streams to achieve this.

        List<Integer> integers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8);

        // collecting even elements of original integer list into another list
        // by filtering out numbers that are not even
        List<Integer> evenIntegers = integers.stream()
                .filter(x -> x % 2 == 0)
                .toList();


        System.out.println("Original integers list is: " + integers);
        System.out.println("List made of even integers from original list is: " + evenIntegers);
        System.out.println();

        // 2. Using a list of strings, find and print the longest string using Java streams.

        List<String> bones = List.of("Femur", "Tibia", "Radius", "Humerus", "Clavicle");


        // created optional to collect what may be the longest string from a list
        // using max method and comparing by length of string
        Optional<String> longestBone = bones.stream()
                .max(Comparator.comparingInt(String::length));


        System.out.println(bones + "\nLongest string from the string list is " + longestBone.get());
        System.out.println();

        // 3. Create a stream of numbers from 1 to 100 and use the filter operation
        //    to retain only those numbers which are prime.

        // created stream of integers from 1 to 100 filtering out number that are not prime
        IntStream.rangeClosed(1, 100)
                .filter(Main::isPrime).forEach(System.out::println);
        System.out.println();

        // 4. Given a list of strings, use streams to create a single string which is a concatenation
        //    of all strings separated by a comma.

        String string = bones.stream()
                .reduce((s, s2) -> s.concat("," + s2))
                .get();

        System.out.println(string);
        System.out.println();

        // 5. Given a list of people (a class) with attributes: first name, last name, and age;
        //    use streams to find all people who are older than 18 years.

        List<Person> people = List.of(new Person("John", "Johnson", 30),
                new Person("Liam", "Peterson", 18),
                new Person("Sigourney", "Weaver", 74),
                new Person("Guy", "Smith", 13));

        List<Person> adults = people.stream()
                .filter(person -> person.getAge() >= 18)
                .toList();

        System.out.println("List of people. ");
        people.forEach(System.out::println);
        System.out.println();

        System.out.println("People that are over 18 from the list are \n");
        adults.forEach(System.out::println);
        System.out.println();

        // 6. Create a stream of integers from an array and find the sum of all integers using the reduce method.

        int[] integersArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        // solved with reduce method
        OptionalInt reducedSum = Arrays.stream(integersArray)
                .reduce(Integer::sum);

        // solved with sum method
//        int sum = Arrays.stream(integersArray).sum();

        System.out.println("Integer array: ");
        for (int i : integersArray) {
            System.out.printf("%d + ", i);
        }
        System.out.println("Sum of all elements in array is " + reducedSum.getAsInt());
        System.out.println();

        // 7. Use streams to transform a list of strings into a list of their respective lengths.
        List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven", "eight");

        // created a list by using a stream of the initial list of strings to map a new list
        // with the corresponding string length
        List<Integer> stringsLengths = strings.stream()
                .map(String::length)
                .toList();

        System.out.println("List of strings " + strings + "\nAnd the list of their respective lengths " + stringsLengths);
        System.out.println();

        // 8. Given a string, use streams to count the number of vowels in it.
        String generalUseString = "How many vowels in this string?";

        // split the string into an array of strings, each string being made only of one character
        // decision was made to use a string array in order to use the contains() method of the String class
        String[] splitString = generalUseString.toLowerCase()
                .split("");
        long numberOfVowels = Arrays.stream(splitString)
                .filter("aeiou"::contains)
                .count();

        System.out.println("The string \"" + generalUseString + "\" contains " + numberOfVowels + " vowels. ");
        System.out.println();

        // 9. Using streams, find the total number of characters across a list of strings
        //    excluding whitespace characters.

        List<String> stringList =
                List.of("Apple", "Microsoft", "'   '", "I B M", "Hewlett Packard", "Samsung");

        //  obtaining number of characters in stringList through a stream
        //  by filtering out whitespace characters and then counting them
        long numberOfCharacters = stringList.stream()
                .flatMapToInt(String::chars)
                .filter(c -> !Character.isWhitespace(c))
                .count();

        System.out.println("The list of strings " + stringList + " contains a total of " +
                numberOfCharacters + " non-whitespace characters.");
        System.out.println();

        // 10. Given a list of employee objects with attributes: name, department, and salary;
        //     find the department with the highest total salary.

        List<Employee> employees =
                List.of(new Employee("Mark", Department.CUSTOMER_SERVICE, 2500),
                        new Employee("Fredrik", Department.ACCOUNTING, 3500),
                        new Employee("Serj", Department.IT, 4500),
                        new Employee("Thomas", Department.LOGISTICS, 4500),
                        new Employee("Misha", Department.CUSTOMER_SERVICE, 2500));


        Map<Department, Long> departmentSalary =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                Collectors.summingLong(Employee::getSalary)));

        Department bestDepartment = departmentSalary.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Department with the highest total salary is " + bestDepartment);
        System.out.println();

        // 11. Given a list of products with attributes: name, category, and price;
        //     find the category with the highest average price.
        List<Product> products =
                List.of(new Product("Bike", Category.SPORTS_EQUIPMENT, 1500),
                        new Product("Gucci Flip Flops", Category.CLOTHES, 500),
                        new Product("Office suite", Category.SOFTWARE, 200),
                        new Product("Antivirus", Category.SOFTWARE, 150),
                        new Product("Levi's jeans", Category.CLOTHES, 300),
                        new Product("Soccer ball", Category.SPORTS_EQUIPMENT, 300),
                        new Product("IntelliJ IDEA Ultimate", Category.SOFTWARE, 170));

        Map<Category, Double> averagePriceByCat =
                products.stream()
                        .collect(Collectors.groupingBy(Product::getCategory,
                                Collectors.averagingDouble(Product::getPrice)));

        Category mostExpensive = averagePriceByCat.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Most expensive category of products is " + mostExpensive);
        System.out.println();

    }

    // Checks if int passed is prime
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
