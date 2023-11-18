import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // 1. Write a method named displayTodaysDate that, when called, prints the current date to the console.
//        displayTodaysDate();
//
//        // 2. Write a method named displayDateComponents that accepts a date as an argument and prints its year,
//        //    month, and day components separately (date in the format YYYY-MM-DD).
//        LocalDate argDate = LocalDate.of(1984, 9, 15);
//        displayDateComponents(argDate);
//
//        // 3. Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal,
//        //    and false otherwise (format YYYY-MM-DD).
//        System.out.println(areDatesEqual());
//
//        // 4. Write a method named isTodaySpecificDate that checks if today's date is the date received from the user
//        //    (so the user type in a date, and compare that date with today's date, return true or false).
//        System.out.println(isTodaySpecificDate());
//
//        // 5. Write a method named displayCurrentTime that prints the current time to the console (format HH:MM:SS).
//        displayCurrentTime();

//        // 6. Construct a method named findDayOfWeek that takes in a date and returns the specific day of the week
//        //   (e.g., Monday, Tuesday, etc.) for that date.
//        DayOfWeek dayOfWeek = findDayOfWeek(argDate);
//        System.out.println(dayOfWeek);
//
//        // 7. Design a method titled daysBetween that reads two dates from the console and computes the total
//        //    number of days between them.
//        System.out.println("Input two dates for which you would like to know the distance between in terms of days: ");
//        System.out.println(daysBetween());

        // 8. Construct a method called elapsedTimeSince that ingests a prior time (in the HH:MM:SS format) as its input and displays
        //    the time duration from that moment to the present. This method should return X hours, Y minutes, Z seconds.
        LocalTime priorTime = LocalTime.of(12,23,30);
        System.out.println(elapsedTimeSince(priorTime));

    }

    public static void displayTodaysDate() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }

    public static void displayDateComponents(LocalDate date) {
        System.out.println("Year of date is " + date.getYear() +
                "\nMonth is " + date.getMonth() + "\nDay is " + date.getDayOfMonth());
    }

    public static boolean areDatesEqual() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in two dates to see if they are the same, format is \"YYYY-MM-DD\": ");
        String firstDateString = sc.nextLine();
        String secondDateString = sc.nextLine();

        LocalDate firstDate = LocalDate.parse(firstDateString);
        LocalDate secondDate = LocalDate.parse(secondDateString);

        return firstDate.isEqual(secondDate);
    }

    public static boolean isTodaySpecificDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a date to see if it is today's date, format is \"YYYY-MM-DD\": ");
        String dateString = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(dateString);

        return firstDate.isEqual(LocalDate.now());
    }

    public static void displayCurrentTime() {
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }

    public static DayOfWeek findDayOfWeek(LocalDate date) {
        return date.getDayOfWeek();
    }

    public static int daysBetween() {
        Scanner sc = new Scanner(System.in);
        String firstDateString = sc.nextLine();
        String secondDateString = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateString);
        LocalDate secondDate = LocalDate.parse(secondDateString);
        return Math.abs((int) firstDate.until(secondDate, ChronoUnit.DAYS));

        // ASKED CHAT-GPT FOR HELP HERE AND THIS IS WHAT I GOT, HOWEVER IT DOES NOT WORK
        //return (int) firstDate.until(secondDate).getDays();
    }

    public static String elapsedTimeSince(LocalTime priorTime) {
        long secondsUntil = priorTime.until(LocalTime.now(), ChronoUnit.SECONDS);
        String timeUntilString = new String();
        int hours = (int) secondsUntil / 3600;
        int minutes = (int) (secondsUntil - hours * 3600) / 60;
        int seconds = (int) (secondsUntil - hours * 3600 - minutes * 60);
        timeUntilString = timeUntilString.concat(hours + ":" + minutes + ":" + seconds);
        // ("%d:%d:%d", hours, minutes, seconds)
        LocalTime now = LocalTime.now();

        long lHours = ChronoUnit.HOURS.between(priorTime,now);
        long lMinutes = ChronoUnit.MINUTES.between(priorTime,now) % 60;
        long lSeconds = ChronoUnit.SECONDS.between(priorTime,now) % 60;
        return timeUntilString + "     " + String.format("%d:%d:%d", lHours, lMinutes, lSeconds);

    }
}