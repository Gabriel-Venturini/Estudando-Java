package singleton;

public class client2 {
    public static void main(String[] args) {
        // creates new object using the unique instance
        singleton newObject = new singleton();
        // just to check if the object is the same for
        // both clients vvvvvvvv
        System.out.println(singleton.getInstance());
    }
}