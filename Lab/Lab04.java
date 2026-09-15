public class Lab04 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Pubby pu = new Pubby();
        pu.eat();
        pu.bark();
        pu.weep();

        Car b = new Bugati();
        b.engine();

        Cat c = new Cat();
        c.eat();
        c.meow();

        VolkswagenGroup vg = new VolkswagenGroup();
        vg.group();
        Volkswagen v = new Volkswagen();
        v.car();
        Audi a = new Audi();
        a.car();
        AudiSport as = new AudiSport();
        as.car();
        Lamborghini l = new Lamborghini();
        l.car();
        Porsche p = new Porsche();
        p.car();

        Child ch = new Child();
        ch.fatherHairColor();
        ch.motherEyeColor();
    }
}

class Animals {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animals {
    void bark() {
        System.out.println("Dog is braking");
    }
}
class Pubby extends Dog {
    void weep() {
        System.out.println("Weeping");
    }
}
class Cat extends Animals {
    void meow() {
        System.out.println("Meowing");
    }
}

// Abstract Class
abstract class Car {
    abstract void engine();
}

class Bugati extends Car {

    void engine() {
        System.out.println("Devel Sixteen");
    }
}

class VolkswagenGroup {
    void group() {
        System.out.println("Luxury Cars");
    }
}
class Volkswagen extends VolkswagenGroup {
    void car() {
        System.out.println("Volkswagen Golf");
    }
}
class Audi extends VolkswagenGroup {
    void car() {
        System.out.println("Audi A8");
    }
}
class AudiSport extends Audi {
    void car() {
        System.out.println("Audi Sport RS6 Avant");
    }
}
class Lamborghini extends Audi {
    void car() {
        System.out.println("Lamborghini Revuelto");
    }
}
class Porsche extends VolkswagenGroup {
    void car() {
        System.out.println("Porsche 911 Turbo S");
    }
}

// Multiple Inheritance
interface Father {
    void fatherHairColor();
}
interface Mother {
    void motherEyeColor();
}
class Child implements Father, Mother {
    public void fatherHairColor() {
        System.out.println("Hair color from father");
    }
    public void motherEyeColor() {
        System.out.println("Eye color from mother");
    }
}