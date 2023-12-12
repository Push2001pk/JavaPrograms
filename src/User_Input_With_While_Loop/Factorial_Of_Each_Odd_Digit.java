package User_Input_With_While_Loop;

import java.util.Scanner;

public class Factorial_Of_Each_Odd_Digit 
{
     public static void main(String[] args) 
     {
    	 Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the number........");
 		int a=sc.nextInt();
 		
 		
 		int rem=0;
 		while(a>0)
 		{
 			int fact=1;
 			rem=a%10;
 			if(rem%2!=0)
 			{   int i=1;
 			System.out.println("Factorial of "+rem);
 			    while(i<=rem)
 			    {
 			    	fact=fact*i;
 			    	System.out.println(fact);
 			    	i++;
 			    }
 			    
 				
 			}
 			a=a/10;
 			
 		}
		
	}
}
