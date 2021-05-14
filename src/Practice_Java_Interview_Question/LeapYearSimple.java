package Practice_Java_Interview_Question;

public class LeapYearSimple 
{

	public static void main(String[] args)
	{
		// leap year logic it should be divisible by 4
		// if it is century it should be divisible by 400 as well not only from 100
		int year = 2012;
		boolean b = false;// intially defined as false

		if (year % 4 == 0) 
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)// if all condtion satisfy then only give me true else no
				{
					b = true;
				} 
				else// if not divided by 400 and only divided by 100 and 4 give me false
				{
					b = false;
				}

			} 
			else //if not divided by 100 but divided by 4 then also it's a leap year so give me true
			{
				b = true;
			}

		} 
		else// if not diving by 4 just give me false
		{
			b = false;
		}

		if (b)// true then give me leap 
		{
			System.out.println("Is a leap Year " + year);
		} else {
			System.out.println("Is a not leap Year " + year);
		}

	}

}
