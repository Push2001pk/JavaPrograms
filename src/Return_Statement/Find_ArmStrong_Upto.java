package Return_Statement;



public class Find_ArmStrong_Upto {

	public static void main(String[] args) 
	{
	    
		int count=0;
		for(int i=1;i<=1000;i++)
		{
			
			if( findArmStrong(i)==i)
			{
				System.out.println(i);
				count++;
			}
			if(count==10)
			{
				break;
			}
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
