package Return_Statement;

import java.util.Scanner;

public class Sum_Of_digit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int n=sc.nextInt();
		
		System.out.println(Sum(n));
		
	}
	public static int Sum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}

}
