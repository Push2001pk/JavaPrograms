package Number_System_BY_Method;

import java.util.Scanner;

public class Sum_of_Each_Digit_Factorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		findSum(n);

	}
	public static void findSum(int n)
	{
		int sum=0;
		
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
		System.out.println("Total sum is:- "+sum);
	}

}
