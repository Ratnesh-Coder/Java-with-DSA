class Animals {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}
class Dog extends Animals {
    void sound() {
        System.out.println("Dog barks.");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animals a = new Animals();
        a.sound(); // Output: Animals make sounds.

        Dog d = new Dog();
        d.sound(); // Output: Dog barks.

        Animals ad = new Dog();
        ad.sound(); // Output: Dog barks. (Runtime polymorphism)
    }
}