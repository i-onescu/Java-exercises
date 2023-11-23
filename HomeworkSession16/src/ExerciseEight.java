import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class ExerciseEight {
    public static void main(String[] args) {

        //


        // 1. Create a functional interface that takes a list of integers and returns a list of integers.
        //    Use a lambda expression to implement this interface, such that it returns a list containing
        //    only the odd numbers from the original list.
        UnaryOperator<List<Integer>> integerList = (integers) -> {
            List<Integer> newIntegers = new ArrayList<>();
            for (Integer integer : integers) {
                if (integer % 2 != 0) {
                    newIntegers.add(integer);
                }
            }
            return newIntegers;
        };

        List<Integer> originalIntegerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            originalIntegerList.add(new Random().nextInt(50));
        }

        List<Integer> newIntegerList = new ArrayList<>(integerList.apply(originalIntegerList));

        System.out.println("Original list of integers is \n" + originalIntegerList +
                "\nAnd the list made only of odd numbers from the original list is \n" + newIntegerList);
        System.out.println();

        // 2. Create a functional interface with a method that takes a List<String> representing first names
        //    and returns a List<String> of those names formatted in uppercase.
        //    Implement it using a lambda expression.
        UnaryOperator<List<String>> formattedNames = (names) -> {
            List<String> newNames = new ArrayList<>();
            for (String name : names) {
                newNames.add(name.toUpperCase());
            }
            return newNames;
        };

        List<String> originalNamesList = new ArrayList<>();
        originalNamesList.add("Jared");
        originalNamesList.add("Dinesh");
        originalNamesList.add("Richard");
        originalNamesList.add("Gilfoyle");

        List<String> formattedNamesList = formattedNames.apply(originalNamesList);

        System.out.println("Original list of names is \n" + originalNamesList +
                "\nAnd the formatted list of names is \n" + formattedNamesList);
        System.out.println();

        // 3. Create a functional interface that is generic and takes a list of generic items and a single
        //    generic item, returning a boolean indicating whether the item is in the list.
        //    Implement this interface using a lambda expression.
        BiFunction<List<CatBreed>, CatBreed, Boolean> catBreedContentVerifier = List::contains;

        List<CatBreed> catBreedList = new ArrayList<>();
        catBreedList.add(CatBreed.ABYSSINIAN);
        catBreedList.add(CatBreed.SIBERIAN);
        catBreedList.add(CatBreed.SIAMESE);
        catBreedList.add(CatBreed.PERSIAN);
        catBreedList.add(CatBreed.BURMESE);
        catBreedList.add(CatBreed.BIRMAN);

        boolean ContainsBreed = catBreedContentVerifier.apply(catBreedList, CatBreed.SIBERIAN);

        if (ContainsBreed) {
            System.out.println("List of breeds contains specified cat breed");
        } else {
            System.out.println("List of breeds does not contain specified cat breed");
        }
        System.out.println();

        //  4. Create a functional interface that takes a single double as a parameter and returns a double.
        //  Implement it using a lambda expression to create a utility that returns the square root of the input value.
        DoubleUnaryOperator squareRoot = Math::sqrt;

        double value = 25;
        double sqrtOfValue = squareRoot.applyAsDouble(value);

        System.out.println("The square root of " + value + " is " + sqrtOfValue);
        System.out.println();

        //  5. Create a functional interface with a method that takes two strings and returns a string.
        //     Implement this interface using a lambda expression to create a utility that
        //     joins two strings with a space in between.
        BinaryOperator<String> concatenatorInator = String::concat;

        String string1 = "Not gonna lie ";
        String string2 = "they had us in the first half";
        String newString = concatenatorInator.apply(string1, string2);

        System.out.println("The two original strings are '" + string1 + "' and '" + string2 + "'");
        System.out.println("String made using 'The ConcatenatorInator' is : " + newString);
        System.out.println();

        // 6. Create a functional interface with a method that takes two strings as input and returns an integer.
        //    Implement this interface using a lambda expression to create a custom comparator
        //    that compares strings based on their length (not lexicographically).
        BiFunction<String, String, Integer> compareStringLengths = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        string1 = "Programming language";
        string2 = "Limbaj de programare";
        int compResult = compareStringLengths.apply(string1, string2);

        System.out.println("The string to compare length of are '" + string1 + "' and '" + string2 + "'");
        if (compResult < 0) {
            System.out.println("String number 2 is longer than string number 1. ");
        } else if (compResult > 0) {
            System.out.println("String number 1 is longer than string number 2. ");
        } else {
            System.out.println("Strings have the same length.");
        }
        System.out.println();

        // 7. Create a functional interface that takes a string and an integer n as parameters and returns a string.
        //    Implement it using a lambda expression that returns the first n characters of the string.
        //    If n is larger than the length of the string, it should return the full string.
        BiFunction<Integer, String, String> partOfString = (n, s) -> s.substring(0,Math.min(n, s.length()));

        String originalString = "Sternocleidomastoid";
        int n = 7;

        newString = partOfString.apply(n,originalString);
        System.out.println("Original string is " + originalString +
                " and the string made from its first " + n + " characters are " + newString);
        System.out.println();
    }
}
