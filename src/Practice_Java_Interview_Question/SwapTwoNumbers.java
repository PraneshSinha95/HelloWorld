/* Java Interview Questions
 * 
 * 6 Java Program to Swap Two Numbers with help of temp variable
 * 
 * Link : https://www.youtube.com/watch?v=2TsiBpac-Z0&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=1
 * 
 * Approach : with the help of temporary variable;
 * 
 */

package Practice_Java_Interview_Question;

public class SwapTwoNumbers
{

	public static void main(String[] args)
	{
		int num1=50;
		int num2=60;
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println(" num1 new value is ==>"+num1);
		System.out.println(" num2 new value is ==>"+num2);
		

	}

}
