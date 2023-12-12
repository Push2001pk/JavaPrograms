package User_Input_With_While_Loop;

public class Find_Perfect_number 
{
    public static void main(String[] args) 
    { 
    	for(int i=1;i<=1000000;i++)
    	{
    		findPerfect(i);
    	}
    }
    
	   
    
    public static void findPerfect(int n)
    {   int a=n;
	       
    	int sum=0;
        for(int i=1;i<=n/2;i++)
    		{
        	    if(n%i==0)
        	    {	
    			sum=sum+i;
        	    }
    		}
    	if(sum==a)
    	{
    		System.out.println("The perfect number is:- "+a);
    	}
    }
   
}

