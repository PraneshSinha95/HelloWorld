/* Java interView Question
 * 
 * Java Program to Generate Multiplication Table
 * 
 * Link: https://www.youtube.com/watch?v=ECD4qmqNx2k&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=2
 * 
 */


package Practice_Java_Interview_Question;

public class MultiplicationNumbers
{

	public static void main(String[] args) 
	{
		//output should be like : 
		//2*1=2
		//2*1=4...
		
		int TableNum=2;
		int num=1;
		
		for(int i=1;i<=10;i++)
		{
			int result;
			result=TableNum*num;
			System.out.println("Mulitpler Table of Two is :" +TableNum+"*"+num+"="+result);
			num++;
		}

	}

}
