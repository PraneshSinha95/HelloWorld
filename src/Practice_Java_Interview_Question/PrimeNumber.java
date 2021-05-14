package Practice_Java_Interview_Question;



public class PrimeNumber
{

	public static void main(String[] args)
	{
		//PrimeNumber numbers=new PrimeNumber();
		//numbers.PrimeNumber(2);
		//System.out.println(numbers.PrimeNumber1(num));
		PrimeNumberCheck();

	}
	public static int PrimeNumberCheck()
	{
		int num=2;
		boolean flag=true;
		while(num<=100)
		{
		for(int i=2;i<=num/2;i++)
		{
			
			if(num%i==0)
			{
				flag=true;
				break;
			}
			if(flag==true)
			{
				
				System.out.println("Prime Number ==>"  +num);
				break;
			}
			
		}
		num++;
		}
		return num;
		
	}

}
