import java.util.Scanner;

public class conditions {
    
    public static void main(String[] args) {
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int userAge = ageScanner.nextInt();

        System.out.println(isAdult(userAge));

        // to avoid resource leak in scanner
        // we need to close it using scannerName.close()
        // but the problem is that the scanner wont be
        // able to be accessed again

        // close the scanner
        ageScanner.close();
    }

    private static String isAdult(int age) {
        // works just like python and its quite simple
        // to understand

        if (age > 100 || age <= 0) {
            return "You are lying!";
        }
        else if (age >= 18) {
            return "You are an adult!";
        }
        else {
            return "You are not an adult!";
        }
    }
}
