// final class Lab09 {
//     void display() {
//         System.out.println("This is final class");
//     }
// }
// class Parent {
//     final void show() {
//         System.out.println("Final method in parent class");
//     }
// }
// class Child extends Parent {
//     void show() {
//         System.out.println("Trying to override final method");
//     }
// } 
// public class Main {
//     public static void main(String[] args) {

//         final int x = 10;
//         System.out.println("Value of x: " + x);

//         x = 20;

//         Parent p = new Parent();
//         p.show();

//         class Test extends Lab09 {
//             void display() {
//                 System.out.println("Trying to override final method in final class");
//             }
//         }
//     }
// }

class Grandparent {
    void showGrandparent() {
        System.out.println("This is Grandparent class");
    }
}

class Parent extends Grandparent {
    void showParent() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("This is Child class");
    }
}

public class Lab09 {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.showGrandparent();
        obj.showParent();
        obj.showChild();
    }
}