package LabWork;
// this program wont work it throw an error.
public class CastingExercise {
	
	public static void main (String []args) {
		
		byte b = 10;
		int i = b;
		byte c=i;
		byte d = (byte)i;
		byte x = 10;
		byte y = 20;
		byte sum = x*y;
		
		System.out.println(sum);
	}

}
