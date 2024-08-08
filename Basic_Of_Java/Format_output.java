//JAVA program about Student Details Taking Input From user
import java.util.*;
class Format_output{
	public static void main(String []args){
	        Scanner sc = new Scanner(System.in);
	        System.out.printf("Enter Your Name,Section,Branch,Percentage:\n");
		String name = sc.nextLine();
		char section = sc.next().charAt(0);
		String branch = sc.next();
		float perc = sc.nextFloat();
		System.out.printf("Your name is:%s\n",name);
		System.out.printf("Your Section is:%c\n",section);
		System.out.printf("Your Branch is:%s\n",branch);
		System.out.printf("Your Perc is:%f\n",perc);
	}

}
