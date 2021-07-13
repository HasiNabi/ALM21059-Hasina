package LabWork;
import java.util.Scanner;
public class AreaRectangle 
{
public static void main(String[] args)
	{
	Scanner scanner =  new Scanner(System.in);
	System.out.println("Enter the length of the Rectangle");
	
	double l = scanner.nextDouble();
	
System.out.println("Enter the breadth of the Rectangle");
	
	double b = scanner.nextDouble();
	
	double area = l*b;
	
	System.out.println("Area of Rectangle:"+ area);
	}
	
}
