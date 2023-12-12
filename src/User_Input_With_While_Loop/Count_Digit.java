package User_Input_With_While_Loop;

import java.util.Scanner;

public class Count_Digit
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number A:-  ");
		int a=sc.nextInt();
		
		int count=0;
		while(a>0)
		{
			count++;
			
			a=a/10;
		}
		System.out.println("Total count is:-  "+count);

	}

}
