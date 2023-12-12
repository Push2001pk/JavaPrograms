package Number_System_BY_Method;

public class Factorial_Of_Each_Digit_Upto_5 
{ 
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			findFactorial(i);
		}
		
	}
	public static void findFactorial(int n)
	{
		    int fact=1;
			
			System.out.println("Factorial of "+n+" is:- ");
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
		System.out.println(fact);
		System.out.println("                             ");
	}
	

}
