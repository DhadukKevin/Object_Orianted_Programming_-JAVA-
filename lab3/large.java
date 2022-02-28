import java.io.*;
import java.util.*;
class large
{
	public static void main(String args[])
	{
		System.out.print("Enter Number-------------------------------");
		Scanner s=new Scanner(System.in);
		
		System.out.print("n1=");
		int n1=s.nextInt();

		System.out.print("n2=");
		int n2=s.nextInt();

		System.out.print("n3=");
		int n3=s.nextInt();
		System.out.print("large number=");

		if(n1>n2 && n1>n3)
		{
			System.out.print(n1);
		}
		else if(n2>n3)
		{
			System.out.print(n2);
		}	
		else
		{
			System.out.print(n3);
		}



	}
}