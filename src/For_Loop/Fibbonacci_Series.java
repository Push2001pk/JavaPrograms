package For_Loop;

import java.util.Scanner;

public class Fibbonacci_Series 
{

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int x=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a+" "+b+" ");
		for(int i=1;i<=x;i++)
		{
			int c=b+a;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
	}

}
