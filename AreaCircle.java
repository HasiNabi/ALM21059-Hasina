package LabWork;
import java.util.Scanner;
public class AreaCircle
{
public static void main(String[] args)
	{
	Scanner scanner =  new Scanner(System.in);
	System.out.println("Enter the radius of the Circle");
	
	double radius = scanner.nextDouble();

	double area = Math.PI*(radius*radius)/2;
	double circum = 2*Math.PI*radius;
	System.out.println("Area of Circle:"+ area);
	System.out.println("Circumference of circle:"+ circum);
	
	//circumference 2*Math.PI*radius
	
	}
	
}
