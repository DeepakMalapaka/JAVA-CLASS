class A {
    A() {
        System.out.println("Constructor");
    }
    A(int n) {
        System.out.println("Constructor is parameterized");

    }
    public static void main (String args[]) {
        A obj1=new A();
        A obj2=new A(5);
           
    }
}