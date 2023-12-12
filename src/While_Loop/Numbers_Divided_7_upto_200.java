package While_Loop;

public class Numbers_Divided_7_upto_200 
{

	public static void main(String[] args) 
	{
		System.out.println("Even no upto 100...............");
		System.out.println("================================");
		
		int i=1;
		while(i<=200)
		{
			if(i%7==0)
			{
				System.out.println(i);
			}
			i++;
		}
 
	}

}
