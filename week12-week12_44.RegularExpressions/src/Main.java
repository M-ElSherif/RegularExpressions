
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string: ");
        String string = reader.nextLine();
        clockTime(string);
    }

    public static boolean isAWeekDay(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is fine.");
            return true;
        } else {
            System.out.println("The form is wrong.");
            return false;
        }
    }

    public static boolean allVowels(String string) {
        if (string.matches("[aeiouäö]*")) {
            System.out.println("The form is fine.");
            return true;
        } else {
            System.out.println("The form is wrong.");
            return false;
        }
    }

    public static boolean clockTime(String string) {
        if (string.matches("[0-2][0-4]:[0-6][0-9]:[0-6][0-9]")) {
            if (!string.matches("24:[0-6][0-9]:[0-6][0-9]") && !string.matches("[0-2][0-4]:6[1-9]:[0-6][0-9]") && !string.matches("[0-2][0-4]:[0-6][0-9]:6[1-9]")) {
                System.out.println("The form is fine.");
                return true;
            }
        } else {
            System.out.println("The form is wrong.");
        }
        return false;
    }
}
