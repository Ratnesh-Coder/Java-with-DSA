class Student {
    protected void finalize() { // finalize method is called by garbage collector when object is destroyed
        System.out.println("finalize method called");
    }
}
public class Finalize {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1 = null;
        System.gc();
    }
}