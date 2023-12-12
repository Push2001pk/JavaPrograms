package Number_System_BY_Method;

import java.util.Scanner;

public class Check_Prime 
{

	public static void main(String[] args) 
	{
//		for(int i=2;i<=20;i++)
//		{}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		checkPrime(n);
		
	}
	public static void checkPrime(int n)
	{
		int count=0;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if(count==0)
		{
			System.out.println("The number is prime "+n);
		}
//		else 
//		{
//			System.out.println("The number is not prime");
//		}
	}

}
