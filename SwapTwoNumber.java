package LabWork;

public class SwapTwoNumber {
	
	public static void main(String args[]) {
		
		float first = 2.50f, second = 4.50f;
		
			System.out.println("--Before swap--");
			System.out.println("First Number:" +first);
			System.out.println("Second Number:" +second);
			
		float temporary = first;
		first = second;
		second = temporary;
		
			System.out.println("After Swap");
			System.out.println("first Number:" +first);
			System.out.println("Second Number:" +second);
		
		
	}

}
