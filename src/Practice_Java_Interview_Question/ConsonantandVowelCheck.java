/* Java Interview Questions
 * 
 * Java Program to Check Whether an Alphabet is Vowel or Consonant
 * 
 * Link : https://www.youtube.com/watch?v=2TsiBpac-Z0&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=1
 * 
 * Approach By if and also by switch statement
 * 
 */
package Practice_Java_Interview_Question;

import java.util.Scanner;

public class ConsonantandVowelCheck {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character==>");
		char letter=sc.next().charAt(0);
		
		if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U'||letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
		{
			System.out.println("Entered Character "+ "  " +letter+"   "+"is a vowel");
		}
		else
		{
			System.out.println("Entered Character "+ "  " +letter+"   "+"is a consonant");
		}
		
		
		//by using switch case:
		
		switch(letter)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		
		System.out.println("Entered Character "+ "  " +letter+"   "+"is a vowel");
		break;
		default:
			
			System.out.println("Entered Character "+ "  " +letter+"   "+"is a consonant");
			break;
		}
		
		
		
		
		
		sc.close();

	}

}
