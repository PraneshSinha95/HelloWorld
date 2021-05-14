/* Java interview Question
 * 
 * Java Program to Check Whether a Number is Prime or Not
 * https://www.youtube.com/watch?v=RUtExMqU2r0&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=3
 * 
 * 
 * from 1 -100;
 * for a specific number 

 
 
 */

package Practice_Java_Interview_Question;

public class PrimeNumberProgram 
{

	public static void main(String[] args) 
	{
		//3 5 7 11 13 17 19 
	// fro printing 1-100	
//	int num;
//	
//	int j;
//	
//	for(num=2;num<100;num++)
//	{
//		boolean flag=false;
//		for(j=2;j<num;j++)
//		{
//			if(num%j==0)
//			{
//				flag=true;
//				break;
//			}
//			
//		}
//		if(!flag)
//		{
//			System.out.println("Number is prime number "+num);
//		}
//	}
	

	// to chedk wether entered number is prime or not 
		
		
		int number = 19;
		boolean flag=false;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Is not a prime number");
		}
		else
		{
			System.out.println("is a prime number");
		}
		
		
		
		
		
//		int i,s,j;
//		for(i=2;i<100;i++)
//		{
//			s=0;
//			for(j=2;j<i;j++) 
//			{
//				if(i%j==0)	
//				{
//					s=1;
//					break;
//				}
//			}
//			if(s==0)
//	{
//	System.out.print(i+" ");
//	}
//		}
//	}
	
	}
}


