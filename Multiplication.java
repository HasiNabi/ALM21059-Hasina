package LabWork;
import java.util.Scanner;

public class Multiplication {
public static void main (String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.println ("Enter the value of i :");
	int i = scan.nextInt();

	System.out.println ("Enter the value of j");
	int j = scan.nextInt();
	
	int mul = i*j;
	System.out.println ("The multiplication of two numbers:" +mul);
	

}
}