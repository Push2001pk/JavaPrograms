package For_Loop;

public class Find_Number {

	public static void main(String[] args) 
	{
		for(int i=1;i<=100000;i++)
		{
			findStrong(i);
		}

	}
	public static void findStrong(int n)
    {  
		int a=n;
		int sum=0;
		while(n>0)
		{     int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==a)
		{
			System.out.println("The number is a strong number:- "+a);
		}
//		else
//		{
//			System.out.println("The number is not a strong number:- "+a);
//		}
	}

}
