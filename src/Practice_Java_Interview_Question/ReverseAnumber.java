/* Java Interview QUestion
 * 
 * Java Program to Reverse a Number
 * 
 * link : https://www.youtube.com/watch?v=ECD4qmqNx2k&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=2
 * 
 */

package Practice_Java_Interview_Question;

public class ReverseAnumber 
{

	public static void main(String[] args)
	{
	int number =1238;
	int mod=0;
	int rev=0;
	while(number!=0)
	{
		mod=number%10;
		rev=rev*10+mod;
		number=number/10;
		
	}
	System.out.print(rev);

	}

}
