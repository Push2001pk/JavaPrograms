package User_Input_With_While_Loop;

import java.util.Scanner;

public class Sum_of_Each_Digit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.........");
		int a=sc.nextInt();
		
		int rem=0;
		int sum=0;
		 while(a>0)
		 {
			 rem=a%10;
			 sum=sum+rem;
			 
			 a=a/10;
			 
		 }
		 System.out.println("Sum of each digit is:- "+sum);

	}

}
