package User_Input_With_While_Loop;

import java.util.Scanner;

public class Sum_Of_Factorial_Of_Each_Digit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the number........");
 		int a=sc.nextInt();
 		int x=a;
 		int rem=0;
 		int sum=0;
 		while(a>0)
 		{ 
 			rem=a%10;
 			int fact=1;
 			int i=1;
 			while(i<=rem)
 			{
 				fact=fact*i;
 				i++;
 			}
 			sum=sum+fact;
 			a=a/10;
 			
 			
 		}
 		if(sum==x)
 		{
 			System.out.println("This is strong number:- "+x);
 		}
 		else
 		{
 			System.out.println("This is not Strong number:- "+x);
 		}
 		
 	//	System.out.println("Sum is :- "+sum);
		
	}

}
