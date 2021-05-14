/** Interview Basic Questions
 * Asked Generally 
 * 
 * Question: Java Program to Print an Integer (Entered by the User).
 * 
 * 
 */

package Practice_Java_Interview_Question;

import java.util.Scanner;

public class PrintIntegerEnteredByUser 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A value ");
		int EnterNum=sc.nextInt();
		System.out.println("the Required Interger Number is "+EnterNum);
		
		sc.close();
		
		

	}

}
