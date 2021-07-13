package LabWork;

public class SumofArray {
	
	public static void main (String [] args)
	{
		
		int[]array = {10,20,30,40,50};
		int sum = 0;
		for (int num : array)
		{
			
			sum = sum+num;
			
		}
		System.out.println("The sum of array element is " + sum);
		
	}

}
