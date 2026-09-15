class Animal {
    int age = 5;
}
class Dog extends Animal {
    int age = 10;
    void display() {
        System.out.println("Age of Dog: " + age);
        System.out.println("Age of Animal: " + super.age);
    }
}
