package LabWork;
import java.util.Scanner;
public class AreaSquare
{
public static void main(String[] args)
	{
	Scanner scanner =  new Scanner(System.in);
	System.out.println("Enter the side of the Square");
	
	double s = scanner.nextDouble();
	
	
	double area = s*s;
	
	System.out.println("Area of Rectangle:"+ area);
	}
	
}
