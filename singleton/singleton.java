package singleton;

public class singleton {
    
    static Object instance;

    public static Object getInstance() {
        if (instance == null) {
            // creates new instance if theres none
            instance = new singleton();
        }
        return instance; // return the actual instance
    }
}

