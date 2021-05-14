/* Java interview Question
 * 
 * Java Program to Calculate the Sum of Natural Numbers
 * 
 * Link : https://www.youtube.com/watch?v=ECD4qmqNx2k&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=2 
 */


package Practice_Java_Interview_Question;

public class NaturalNoSum
{

	public static void main(String[] args) 
	{
		int num=100;
		int sum=0;
		int NatNum=1;
//		while(num>=1)
//		{
//			sum=sum+NatNum;
//			NatNum++;
//			num--;
//			
//		}
//		System.out.println(sum);
		
		for (int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
