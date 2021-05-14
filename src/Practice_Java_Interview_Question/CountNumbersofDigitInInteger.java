/* java Interview question
 * 
 * Java Program to Count Number of Digits in an Integer
 * 
 * link : https://www.youtube.com/watch?v=ECD4qmqNx2k&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=2
 * 
 */
package Practice_Java_Interview_Question;

public class CountNumbersofDigitInInteger
{

	public static void main(String[] args)
	{
	//4564 hai th isme 4 numbers hai 
		
			int num=1;
			int count=0;
			
			while(num!=0)
			{
				num=num/10;
				count++;
				
			}
			System.out.println(count);
	}

}
