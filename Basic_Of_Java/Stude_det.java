//JAVA program about Student Details Taking Input From user
import java.util.*;
class Stude_det{
	public static void main(String []args){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Your Name,Section,Branch,Percentage");
		String name = sc.nextLine();
		char section = sc.next().charAt(0);
		String branch = sc.next();
		float perc = sc.nextFloat();
		System.out.println("Your name is:"+name);
		System.out.println("Your Section is:"+section);
		System.out.println("Your Branch is:"+branch);
		System.out.println("Your Perc is:"+perc);
	}

}
