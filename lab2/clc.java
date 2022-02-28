import java.io.*;
import java.util.*;
class clc
{
	public static void main(String args[])
	{
		System.out.println("Enter Number----------------------");
		Scanner s=new Scanner(System.in);
		
		System.out.print("n1=");
		int n1=s.nextInt();

		System.out.print("n2=");
		int n2=s.nextInt();

		System.out.print("op=");
		String s1=s.next();
		char op=s1.charAt(0);

		System.out.println("Output--------------------------");
		if(op=='+')
		{
			System.out.print("Sum=");
			System.out.println(n1+n2);
		}
		else if(op=='-')
		{
			System.out.print("Sub=");
			System.out.println(n1-n2);
		}
		else if(op=='*')
		{
			System.out.print("Mul=");
			System.out.println(n1*n2);
		}
		else if(op=='/')
		{
			System.out.print("Div=");
			System.out.println(n1/n2);
		}
		else if(op=='%')
		{
			System.out.print("Mod=");
			System.out.println(n1%n2);
		}
		else
		{
			System.out.println("invalid input-------------------------");
		}


	}
}