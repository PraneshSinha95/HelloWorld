/* Java Interview Questions
 * 
 * ArmStrong Numbers
 * 
 * Java Program to Check Armstrong Number
 * 
 */
package Practice_Java_Interview_Question;

public class ArmStrongNumber 
{

	public static void main(String[] args)
	{
		int num=371;
		
		int originalNum=num;
		int ArmStro=originalNum;
		int digits=0;
		while(num!=0)
		{
			
			num=num/10;
			digits++;
			
		}
		
		System.out.println(digits);
		int pow=digits;
		double sum=0;
		double sum1=0;
		while(originalNum!=0)
		{
			int res;
			
			res=originalNum%10;
			sum=Math.pow(res, pow);
			sum1=sum+sum1;
			
			originalNum=originalNum/10;
			System.out.println(sum);
		}
		int ArmCheck=(int)sum1;
		System.out.println(ArmCheck);
		
		if(ArmCheck==ArmStro)
		{
			System.out.println("IS a armstrong Number ="+ArmStro);
		}
		else
		{
			System.out.println("is not a Arm Strong number");
		}
		
	}

}
