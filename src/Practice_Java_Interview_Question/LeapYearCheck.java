/* Interview Question
 * 
 * Leap Year
 * 
 * Source : OWn
 */



package Practice_Java_Interview_Question;

import java.util.Scanner;

public class LeapYearCheck 
{
static int year;

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year number");
		year=sc.nextInt();
		
		if(yeartype(year)==true)
		{
			System.out.println("Is a leap year"+year);
		}
		else if(yeartype(year)==false)
		{
		System.out.println(" Not a leap yesr"+year);	
		}
		
		
		
		
	}
	public static boolean yeartype(int year)
	{
		
		if(year%100==0&&year%400==0&&year%4==0)
		{
			
				return true;
			
		}
		
		if(year%100==0)
		{
			return false;
		}
		if(year%4==0)
		{
			return true;
		}
		
		return false;
	}
	
}
