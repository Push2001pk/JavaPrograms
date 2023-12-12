package User_Input_With_While_Loop;

import java.util.Scanner;

public class Factoria_of_Each_Digit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number........");
		int a=sc.nextInt();
		int rem=0;
		while(a>0)
		{
			rem=a%10;
			int fact=1;
			int i=1;
			System.out.println("Factoria of "+rem );
			while(i<=rem)
			{
				fact=fact*i;
				System.out.println(fact);
				i++;
			}
			System.out.println("================================");
			a=a/10;
		
			
		}
	}

}
