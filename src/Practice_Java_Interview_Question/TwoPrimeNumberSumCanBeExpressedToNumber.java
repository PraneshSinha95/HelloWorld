package Practice_Java_Interview_Question;

public class TwoPrimeNumberSumCanBeExpressedToNumber
{

	public static void main(String[] args) 
	{
		// 19+17=36
		
		int num1=36;
		int pri1=19;
		int pri2=17;
		
		boolean pri1Check=false;
		for(int i=2;i<=pri1/2;i++)
		{
			if(pri1%i==0)
			{
				pri1Check=true;
				break;
			}
		}
		if(!pri1Check)
		{
			System.out.println("Is a prime Number");
		}

	}

}
