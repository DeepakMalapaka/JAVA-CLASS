public class A {
    static void display() {
        System.out.println("I am method from A");
    }
}
public class Method_overiding extends A{
    public static void main(String args[]) {
        display();
    }
    static void display() {
        System.out.println("I am method from main");
    }
}