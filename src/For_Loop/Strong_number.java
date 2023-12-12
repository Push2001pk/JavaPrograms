package For_Loop;

import java.util.Scanner;

public class Strong_number 
{

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int a=sc.nextInt();
		int sum=0;
		int x=a;
		
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
		 System.out.println("=====================================");
		 if(x==sum)
		 {
			 System.out.println("The number is a strong number. ");
		 }
		 else
		 {
			 System.out.println("The number is not a strong number. ");
		 }

	}

}
