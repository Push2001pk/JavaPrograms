package Return_Statement;

import java.util.Scanner;

public class find_Armstrong_number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int n=sc.nextInt();
		
		if(findArmStrong(n)==n)
		{
			System.out.println("The number is a armStrong number :- "+findArmStrong(n));
		}
		else
		{
			System.out.println("The number is not  a armStrong number :- "+findArmStrong(n));
		}
	}
	public static int count(int n)
	{  int count=0;
	
		while(n>0)
		{
			int x=n%10;
			count++;
			n=n/10;
		}
		return count;
	}
	public static int Pow(int a,int b)
	{   
	    int pow=1;
	    for(int i=1;i<=b;i++)
	    {
	    	pow=pow*a;
	    }
	    
		return pow;
	}
	public static int findArmStrong(int n)
	{
		int sum=0;
		int x=count(n);
		while(n>0)
		{
			int rem=n%10;
			sum=sum+Pow(rem,x);
			n=n/10;
		}
		return sum;
	}

}
