package For_Loop;

import java.util.Scanner;

public class Count_The_Factor {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: -");
		int a=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		
		}
		System.out.println("Total count is:- "+count);
		
	}

}
