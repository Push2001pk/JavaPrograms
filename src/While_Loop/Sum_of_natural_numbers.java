package While_Loop;

public class Sum_of_natural_numbers 
{

	public static void main(String[] args)
	{
		int sum=0;
		int i=1;
		while(i<=100)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Total sum is :-  "+sum);
	}

}
