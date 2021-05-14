/*  Java interview Question 
 * 
 * Java Program to Make a Simple Calculator Using switch...case
 * 
 * https://www.youtube.com/watch?v=RUtExMqU2r0&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=3
 * 
 */


package Practice_Java_Interview_Question;

import java.util.Scanner;

public class SimpleCalc
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First Number ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number ");
		int num2 =sc.nextInt();
		System.out.println("Choose any operator which you want to perfome  +,-,/,*");
		char operator=sc.next().charAt(0);
		
		switch (operator)
		{
		case '+':
			System.out.println(num1+num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		case '*':
		System.out.println(num1*num2);
		break;
		case '-':
			System.out.println(num1*num2);
				break;	
			

		default:
			System.out.println("You have not choosen correct operator ");
			break;
		}
		
		

	}

}
