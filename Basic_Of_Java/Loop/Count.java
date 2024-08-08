import java.util.*;
class Count{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int rem,count=0;;
while(num!=0){
rem = num%10;
System.out.println(rem+" ");
num = num/10;
count++;
}
System.out.println("count:"+count);

}
}
