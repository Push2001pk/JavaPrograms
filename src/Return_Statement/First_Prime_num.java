package Return_Statement;

import Number_System_BY_Method.Check_Prime;

public class First_Prime_num 
{

	public static void main(String[] args) 
	{   int count=0;
		for(int i=2;i<=100 ;i++)
		{ 
			
			Check_Prime a=new Check_Prime();
			a.checkPrime(i);
			count++;
			
			
			
		}
		
		
	}

}
