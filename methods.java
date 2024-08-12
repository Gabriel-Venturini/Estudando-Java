import java.util.Scanner; // import scanner class

public class methods {
    
    public static void main(String[] args) {
        helloWorld(); // hello world
        
        twoSum(5, 10); // 15
        
        String yourSurname = returnSurname();
        System.out.println(yourSurname);
    }

    private static void helloWorld() {
        // we need to declare it in the main method
        // so it can be used bcs java runs on main only

        System.out.println("Hello World!");
    }

    private static void twoSum(int a, int b) {
        // we can declare any parameters we want
        // and to call the method you are forced
        // to input the values of the parameters
        
        int sum = a + b;
        System.out.println(sum);

    }

    private static String returnSurname() {
        // you can make a method return a value
        // you need to change "void" to the type of the value
        // you expect to return

        // to get the user info we use scanner and later we see how to use it
        // but basically you need to import java.util.Scanner

        Scanner surname = new Scanner(System.in); // user input
        System.out.println("Enter surname: ");

        String userSurname = surname.nextLine(); // read user input
        
        return "Your surname is: " + userSurname;
    }
}
