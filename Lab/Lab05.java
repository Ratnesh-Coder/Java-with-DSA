// Simple Interface
interface Printable {
    void print();
}

class Main1 implements Printable {
    public void print() {
        System.out.println("Hello");
    }
}


// Interface Inheritance
interface Animal {
    void sound();
}

interface Dog extends Animal {
    void eat();
}

class Puppy implements Dog {
    public void sound() {
        System.out.println("Puppy is barking");
    }

    public void eat() {
        System.out.println("Puppy is eating");
    }
}


// Multiple Inheritance using Interface
interface Lion {
    void lionSound();
}

interface Tiger {
    void tigerSound();
}

class Liger implements Lion, Tiger {
    public void lionSound() {
        System.out.println("Roar from Lion");
    }

    public void tigerSound() {
        System.out.println("Roar from Tiger");
    }
}


// Default Method in Interface
interface Drawable {
    void draw();

    default void msg() {
        System.out.println("Default method");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}


// Static Method Example
class Demo {
    static void display() {
        System.out.println("Hello from static method!");
    }
}


// Nested Interface
class Outer {

    interface InnerInterface {
        void show();
    }
}

class Test implements Outer.InnerInterface {
    public void show() {
        System.out.println("Nested Interface Method");
    }
}


// MAIN CLASS (Only One Public Class)
public class Lab05 {

    public static void main(String[] args) {

        System.out.println("---- Simple Interface ----");
        Main1 m = new Main1();
        m.print();

        System.out.println("\n---- Interface Inheritance ----");
        Puppy p = new Puppy();
        p.sound();
        p.eat();

        System.out.println("\n---- Multiple Inheritance ----");
        Liger l = new Liger();
        l.lionSound();
        l.tigerSound();

        System.out.println("\n---- Default Method ----");
        Drawable d = new Rectangle();
        d.draw();
        d.msg();

        System.out.println("\n---- Static Method ----");
        Demo.display();

        System.out.println("\n---- Nested Interface ----");
        Test t = new Test();
        t.show();
    }
}
