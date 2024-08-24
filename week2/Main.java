import java.util.*;
public class Main {
    static int add(int a,int b) {
        return a+b;
    }
    int mul(int x,int y) {
        return x*y;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to perform sum:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b);
        System.out.println("The sum of entered two numbers is:"+sum);
        System.out.println("Enter two numbers to perform sum:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Main obj=new Main();
        int product=obj.mul(x,y);
        System.out.println("The product of entered two numbers is:"+product);
    }
} 
