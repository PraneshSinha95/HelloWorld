/* Java Interview Question 
 * 
 * Factorial of a number
 * 
 * Link : https://www.youtube.com/watch?v=ECD4qmqNx2k&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=2
 */



package Practice_Java_Interview_Question;

public class FactorialNumber {
	static int TofindFactOf=6;
	public static void main(String[] args) {
		// Factorial of 5!=5*4*3*2*1=120

		
		//solving from one type
//		int FactNum = 5;
//		int Num = 1;
//		int Num2 = 1;
//
//		while (FactNum >= Num) {
//			Num2 = Num2 * Num;
//			Num = Num + 1;
//		}
//		System.out.println(Num2);
		
		Factorial(TofindFactOf);
		
		
	}
	
	//By using method 
	
	public static void Factorial(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factotrial Of entered Number "+TofindFactOf+"is==>"+fact);
		
	}
	
	
	
	
	
}
