package For_Loop;

import java.util.Scanner;

public class HCF
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the first number:- ");
		  int a=sc.nextInt();
		  System.out.println("Enter the second number:- ");
		  int b=sc.nextInt();
		  System.out.println("Enter the third number:- ");
		  int c=sc.nextInt();
		  
		  int Small=(a<b && a<c)?a:(b<c?b:c);
		  for(int i=Small;i>0;i--)
		  {
			  if(a%i==0 && b%i==0 && c%i==0)
			  {
				  System.out.println(i);
				  break;
			  }
		  }
	}

}
