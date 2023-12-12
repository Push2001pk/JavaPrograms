package For_Loop;

import java.util.Scanner;

public class Sum_Of_Factorial_of_each_digit
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int a=sc.nextInt();
		int sum=0;
		
		 while(a>0)
	    {    
			 int rem=0;
			 int fact=1;
			 rem=a%10;
		     System.out.println("Factorial of "+rem+" is:- ");
			 for(int i=1;i<=rem;i++)
			 {
				 fact=fact*i;
				 System.out.println(fact);
				
			 }
			
			 System.out.println("===================================");
			 a=a/10;
			 sum=sum+fact;
			 
		 }
		 System.out.println("Sum of each digit factorial is:- "+sum);
		 
	}

}
