/* Java interview Questions
 * 
 * 
 * Java Program to Check Whether a Character is Alphabet or Not
 * 
 * https://www.youtube.com/watch?v=ECD4qmqNx2k&list=PLFGoYjJG_fqrq8mBHeWh1ZQOlqRD0HFIh&index=2
 * 
 */
package Practice_Java_Interview_Question;

public class CharIsAlphaOrNot
{

	public static void main(String[] args) 
	{
		char c='#';
		
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			System.out.println("Is a Alpahabet ==>  " +c);
		}
		else
		{
			System.out.println("Is not a Alpahabet ==>  " +c);
		}
	}

}
