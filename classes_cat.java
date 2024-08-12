public class classes_cat {
    // this serves as a blueprint/interface of a cat
    // so its not an object itself but it can be
    // if you instantiate it as a object
    String name;
    int age;

    public static void meow() {
        // static means that we can call this method
        // without creating an object
        // so if it didnt had the static you wouldnt be able to
        // call the meow method without the classes_cat object
        System.out.println("meow");
    }

    
}
