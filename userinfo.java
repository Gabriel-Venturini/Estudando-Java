import java.util.Scanner; // import scanner class

public class userinfo {
    
    public static void main(String[] args) {
        // get user name and prints it

        Scanner userInput = new Scanner(System.in); // create a scanner
        System.out.println("Enter username:");

        String userName = userInput.nextLine(); // read user input
        System.out.println("Username is: " + userName);
    }
}
