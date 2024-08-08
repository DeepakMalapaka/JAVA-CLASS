import java.util.*;
class Mul{
	public static void main(String args[]){
	int n,i;
	System.out.println("Enter a num for table=");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println("Enter upto what number the table should display=");
	int num=sc.nextInt();
	System.out.println("Multiplication table is ");
	for(i=1;i<=num;i++){
	System.out.println(n+"X"+i+"="+n*i);
	}
	}
	}
