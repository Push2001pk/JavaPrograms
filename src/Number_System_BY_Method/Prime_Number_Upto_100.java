package Number_System_BY_Method;

public class Prime_Number_Upto_100 
{

	public static void main(String[] args) 
	{
		for(int i=2;i<=100;i++)
		{
			Check_Prime a=new Check_Prime();
			a.checkPrime(i);
		}

	}
//	public static void findPrime(int n);
//	{
//		int count=0;
//		
//		for(int i=2;i<=n/2;i++)
//		{
//			if(n%i==0)
//			{
//				count++;
//			}
//			if(count==0)
//			{
//			    System.out.println("The number is a prime number.");
//			    
//			}
//			else
//			{
//				System.out.println("The number is not a prime number.");
//			}
//		}
//	}

}
