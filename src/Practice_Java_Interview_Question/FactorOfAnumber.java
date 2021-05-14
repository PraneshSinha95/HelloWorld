/* Java Interview Question
 * 
 * Java Program to Display Factors of a Number
 * 
 * https://www.youtube.com/watch?v=RUtExMqU2r0&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=3
 */
package Practice_Java_Interview_Question;

import java.util.Scanner;

public class FactorOfAnumber
{

	public static void main(String[] args) 
	{
	int num = 50;
	
	for(int i=1;i<=50;i++)
	{
		if(num%i==0)
		{
			System.out.println("Factor of "+num+"is= "+i);
		}
	}
		
	}

}
