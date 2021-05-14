/* Java InterView Questions
 * 
 * Java Program to Display Fibonacci Series
 * 
 * Link : https://www.youtube.com/watch?v=ECD4qmqNx2k&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=2
 * 
 */
package Practice_Java_Interview_Question;

public class FibonaciiSeries
{

	public static void main(String[] args) 
	{
		//Factorial Number = 0,1,1,2,3,5,8
		
		int fibnumber=0;
		int num1=1;
		for(int i=0;i<=10;i++)
		{
			System.out.println(fibnumber);//printing the number firstly the first number will be printed
			int sum=fibnumber+num1;//storing in sum say sum=0+1 for the first time
			fibnumber=num1;//0=1
			num1=sum;	//1=1
		}

	}

}
