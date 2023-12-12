package Number_System_BY_Method;

import java.util.Scanner;

public class Find_Factors 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		findPrime(n);

	}
	public static void findPrime(int n)
	{   System.out.println("Factors of the number "+n+" is.");
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
