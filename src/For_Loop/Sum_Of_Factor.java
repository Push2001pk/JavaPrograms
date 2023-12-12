package For_Loop;

import java.util.Scanner;

public class Sum_Of_Factor 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int a=sc.nextInt();
		
		int sum=0;
		for(int i =1;i<=a/2;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum of all factors is:- "+sum);

	}

}
