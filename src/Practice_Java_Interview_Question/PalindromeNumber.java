/* java interview Question
 * 
 * Java Program to Check Whether a Number is Palindrome or Not
 * 
 * link: https://www.youtube.com/watch?v=RUtExMqU2r0&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=3
 */
package Practice_Java_Interview_Question;

public class PalindromeNumber 
{

	public static void main(String[] args)
	{
		int number=1232;
		int mod=0;
		int rev=0;
		int palindromeCheck=number;
		while (palindromeCheck!=0)
		{
			
			mod=palindromeCheck%10;
			rev=rev*10+mod;
			palindromeCheck=palindromeCheck/10;
		}

		//System.out.println(rev);
		
		if(number==rev)
		{
			System.out.println("Entered  number =:"+number+"is a palindrome "+rev);
		}
		else
		{
			System.out.println("Entered  number =:"+number+"is not a palindrome "+rev);
		}
		
	}

}
