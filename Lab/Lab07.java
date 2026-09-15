// Write a Java program to demonstrate constructor chaining using the super keyword.

// Write a Java program to create a package named myPackage.
// Inside the package, create a class Vehicle with a method show() that prints "Vehicle from myPackage".
// Create another class to import and use the Vehicle class.
// Demonstrate how to compile and run the program.

// Write a Java Program to demonstrate method overriding.

import myPackage.Vehicle;

class Animal {
    String name;
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor is called");
        System.out.println("Animal name is: " + name);
    }
}
class Dog extends Animal {
    String breed;
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog constructor is called");
        System.out.println("Dog breed is: " + breed);
    }

}

class Car {
    void engine() {
        System.out.println("Car engine");
    }
}
class ToyotaSupraMK4 extends Car {
    void engine() {
        System.out.println("Toyota 2JZ-GTE");
    }
}

public class Lab07 {
    public static void main(String[] args) {
        Dog d = new Dog("Rocky", "Labrador");

        Vehicle v = new Vehicle();
        v.show();

        Car c = new Car();
        c.engine();
        ToyotaSupraMK4 t = new ToyotaSupraMK4();
        t.engine();
    }
}


