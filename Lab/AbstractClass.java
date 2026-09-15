abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("Animal is sleeping:");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    void sleep() {
        System.out.println("Dog is sleeping:");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.sleep();
    }
}
