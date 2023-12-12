package User_Input_With_While_Loop;

import java.util.Scanner;

public class Find_A_to_Power_B 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number A:-  ");
		int a=sc.nextInt();
		System.out.println("Enter the number B:-  ");
		int b=sc.nextInt();
		
		int i=1;
		int pow=1;
		
		while(i<=b)
		{
			pow=pow*a;
			i++;
		}
	    System.out.println("A to power B is:- "+pow);
	}

}
