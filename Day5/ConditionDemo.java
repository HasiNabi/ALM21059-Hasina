package Day5;
import java.util.Scanner;
public class ConditionDemo {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number..:");
		int x=scan.nextInt();
		
		if(x%2==0) {//last best
			System.out.println("Even Number...");
		}
		else {
			System.out.println("Odd Number......");
		}
		
		//String s=(x%2==0)?"Even Number...Ternary":"Odd Number...Ternary";
		
		//System.out.println(s);
		
		System.out.println((x%2==0)?"Even number...teeeee":"odd number....teee");//ternary is best
		
		switch(x%2) //switch is next best
		{
			case 0:{
				System.out.println("Even number.....sc");
				break;
			}
			case 1:{
				System.out.println("Odd Number......sc");
				break;
			}
		}
	}
}