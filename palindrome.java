import java.util.Scanner;
public class palindrome{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);

		System.out.print("Enter N:");
		int n=s.nextInt();
		int a=0,i,b=n;
		
		while(n>0)
		{
			i=n%10;
			n=n/10;
			a=(a*10)+i;
		}
		
		if(a==b)
		{
			System.out.print(b+" Is palindrome Number");
		}
		else
		{
			System.out.print(b+" Is not palindrome Number");
		}
	}
}