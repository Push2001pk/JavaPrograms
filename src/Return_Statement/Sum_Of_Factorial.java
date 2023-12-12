package Return_Statement;

import java.util.Scanner;

public class Sum_Of_Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int n=sc.nextInt();
		
		System.out.println("The sum of factorial is :- "+findSumOfFact(n));
	}
	public static int findSumOfFact(int n)
	{   int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int fact=1;
			
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
						
			}
			sum=sum+fact;
			n=n/10;
		}
		return sum;
	}

}
