package For_Loop;

public class Find_Palindrome_Numbers {

	public static void main(String[] args) 
	{
		for(int i=1;i<=1500;i++)
		{
			findPalindrome(i);
		}
	}
	public static void findPalindrome(int n)
	{   int a=n;
		int num=0;
		while(n>0)
		{
			int x=n%10;
			num=num*10+x;
			n=n/10;
		}
		if(a==num)
		{
			System.out.println("The number is a palindrome number. "+a);
		}
	}

}
