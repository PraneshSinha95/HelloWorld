/* Java Interview Questions
 * 
 * 6 Java Program to Swap Two Numbers without 3rd variable
 * 
 * Link : https://www.youtube.com/watch?v=2TsiBpac-Z0&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=1
 * 
 * Approach : without temporary variable
 * 
 */
package Practice_Java_Interview_Question;

public class SwaptwoNumbersWithoutthirdVariable
{

	public static void main(String[] args) 
	{
	int num1=20;
	int num2=30;
	num1=num1+num2;//50=20+30
	num2=num1-num2;//20= 50-30
	num1=num1-num2;//30=50-20
	
	System.out.println("After Swap value of num1==> " +num1);
	System.out.println("After Swap value of num2==> " +num2);
	

	}

}
