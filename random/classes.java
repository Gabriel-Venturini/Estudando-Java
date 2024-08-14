package random;
public class classes {
    // the thing here is that this class is public
    // so it can be accessed anywhere in the folder
    // but here we want to call another class
    // so we will instatiate it in another .java file
    // called classes_cat.java with a public method to access it
    public static void main(String[] args) {
        // call an method from classes_cat.java
        // without instatiating an object
        // we are able to do it bcs its a static method
        // classes_cat.meow();
        
        // we can create a new object using classes
        // Example

        classes_cat myCat = new classes_cat();
        myCat.name = "Yumi";
        myCat.age = 12;

        classes_cat anotherCat = new classes_cat();
        anotherCat.name = "Alfredo";
        anotherCat.age = 3;

        System.out.println(myCat.name + " is " + myCat.age + " years old.");
        System.out.println(anotherCat.name + " is " + anotherCat.age + " years old.");
    }

}
