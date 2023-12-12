package While_Loop;

public class Numbers_Divided_And_Ends_With_7 
{

	public static void main(String[] args) 
	{
		System.out.println("Even no upto 100...............");
		System.out.println("================================");
		
		int count=0;
		int i=1;
		while(i<=300)
		{
			if(i%7==0 && i%10==7)
			{
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println("Total count is :-  "+count);

	}

}
