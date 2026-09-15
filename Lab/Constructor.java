class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 21;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
    }
}
