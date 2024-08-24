public class Method {
    static void add(int a,int b) {
        int sum=a+b;
        System.out.println("the sum of entered numbers is:"+sum);
    }
    static void add(int a,int b,int c) {
        int sum=a+b+c;
        System.out.println("the sum of entered numbers is:"+sum);
    }
    static void add(int a,int b,int c,int d) {
        int sum=a+b+c+d;
        System.out.println("the sum of entered numbers is:"+sum);
    }
    public static void main(String args[]) {
       add(1,2);
       add(1,2,3);
       add(1,2,3,4);
       
    }
}