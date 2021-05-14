/* Java Interview Question
 * 
 * Java Program to Check Whether a Number is Even or Odd
 * 
 * User Inputed check 
 * 
 */
package Practice_Java_Interview_Question;

import java.util.Scanner;

public class CheckEvenorOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check it is odd or ever ");
		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("Entered number is Even Number ==>" + number);
		} else {
			System.out.println("Entered number is Odd Number==> " + number);
		}

		sc.close();
	}

}
