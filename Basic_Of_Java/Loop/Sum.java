import java.util.*;
class Sum{
public static void main(String args[])
{
	int i;
	int num;
	int sum=0;
	System.out.println("Enter upto what number sum=");
	Scanner obj=new Scanner(System.in);
	num=obj.nextInt();
	System.out.println("sum of numbers from "+1+" "+"to"+" "+num);
	for(i=1;i<=num;i++)
	{
		sum+=i;
	}
	System.out.println(sum);
}	
}
