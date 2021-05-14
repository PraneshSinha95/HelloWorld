/* Program Is not yet completed
    Source Naveen automation java Interview Question Video Lecture 4*/

import java.util.Scanner;


public class NumExpressedInSumOfPrimeNumber
{

	public static void main(String[] args)
	{
		NumExpressedInSumOfPrimeNumber prime=new NumExpressedInSumOfPrimeNumber();
		System.out.println("Enter any Number ");
		Scanner sc=new Scanner(System.in);
		
		boolean Number=prime.PrimeNumber(sc.nextInt());
		System.out.println(Number);
		
	}
	
	public boolean PrimeNumber(int num)
	{
		boolean IsPrime=true;
		for(int i=2;i<=num/2;i++)//55 27.5 
		{
			if(num%i==0)
			{
				IsPrime=false;
				break;
			}
		}
		return IsPrime;
		
	}

}
