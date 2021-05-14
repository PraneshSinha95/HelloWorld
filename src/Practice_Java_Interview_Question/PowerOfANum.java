/* Java InterviewQuestion
 * 
 * Java Program to Calculate the Power of a Number
 * 
 * Link : https://www.youtube.com/watch?v=RUtExMqU2r0&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=3  
 */

package Practice_Java_Interview_Question;

public class PowerOfANum 
{

	public static void main(String[] args) 
	{
		int num=2;
		
		int pow=16;
		int result=1;
		while (pow!=0)
		{
			
			result=num*result;
			pow--;
		}
System.out.println(result);
	}

}
