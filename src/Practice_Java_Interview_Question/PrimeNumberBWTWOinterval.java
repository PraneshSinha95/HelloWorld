package Practice_Java_Interview_Question;

public class PrimeNumberBWTWOinterval
{

	public static void main(String[] args)
	{
		int num;
		
		for(num=19;num<250;num++)
		{
			boolean flag=false;	
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
				flag=true;
				break;
				}
			}
			if(!flag)
			{
				System.out.println(num +" ");
			}
		}
		

	}

}
