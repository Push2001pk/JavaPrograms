package For_Loop;

import java.util.Scanner;

public class LCM 
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
	  
	  for(int i=1;;i++)
	  {
		  if(i%a==0 && i%b==0 && i%c==0)
		  {
			  System.out.println(i);
			  break;
		  }
	  }
   }
}
