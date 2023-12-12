package For_Loop;

public class Skip_Any_Number 
{

	public static void main(String[] args) 
	{

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number for skip.");
//		int n=sc.nextInt();
		
		for(int i=1;i<=200;i++)
		{
			if(i%10==4 || i%10==6)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
