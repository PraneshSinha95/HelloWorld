/* Java Interview Questions
 * 
 * Java Program to Find the Largest Among Three Numbers
 * 
 * Link : https://www.youtube.com/watch?v=2TsiBpac-Z0&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=1
 * 
 */
package Practice_Java_Interview_Question;

public class GreaterAmongThree 
{

	public static void main(String[] args)
	{
	int num1=100;
	int num2=500;
	int num3=300;
	
	if(num1>num2&&num1>num3)
	{
		System.out.println("Given Number num1 is a greatest Number "+num1);
	}
	else if(num2>num1&&num2>num3)
	{
		System.out.println("Given Number num2 is a greatest Number "+num2);
	}
	else if(num3>num1&&num3>num2)
	{
		System.out.println("Given Number num3 is a greatest Number "+num3);
	}
	}

}
