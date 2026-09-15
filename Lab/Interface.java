interface Animal {
    void sound(); // In interface, all methods are public abstract by default
}
class Dog implements Animal {
    public void sound() { // Must be public to implement the interface method because interface methods are public by default
        System.out.println("Dog barks");
    }
}
public class Interface {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}