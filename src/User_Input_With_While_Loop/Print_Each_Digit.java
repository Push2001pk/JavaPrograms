package User_Input_With_While_Loop;

import java.util.Scanner;

public class Print_Each_Digit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number........");
		int a=sc.nextInt();
		
	    while(a>0)
	    {
	    	System.out.println("Each digit is:-   "+(a%10));
	    	
	    	a=a/10;
	    }
	
	}

}
