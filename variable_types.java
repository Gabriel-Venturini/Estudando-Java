public class variable_types {
    public static void main(String[] args) {
        // some basic variable types

        // these three types are primitive types
        int myInt = 2; // stores a int
        double myHeight = 1.8; // stores a double (float)
        char myInitial = 'G'; // stores a single character

        double result = myInt * myHeight; // calculating two variables

        System.out.println(result); // thats how you print variables
        System.out.println("Your name starts with: " + myInitial);

        // there is some non-primitive types too
        String myName = "Gabriel"; // a collection of char
        // just like some other POO languages you can see its methods
        // bcs non-primitive are objects and they have methods to use
        // example: myName.length(); tells you the length of the String
        
        System.out.println(myName.length()); // prints the length of the string

        
    }    
}
