import java.io.*;
import java.util.*;
class clc_switch
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
		int op=s.nextInt();

		switch (op)
		{
			case 1:
				System.out.print("Sum=");
				System.out.println(n1+n2);
				break;

			case 2:
				System.out.print("Sub=");
				System.out.println(n1-n2);
				break;

			case 3:
				System.out.print("Mul=");
				System.out.println(n1*n2);
				break;

			case 4:
				System.out.print("Div=");
				System.out.println(n1/n2);
				break;

			case 5:
				System.out.print("Mod=");
				System.out.println(n1%n2);
				break;

			default:
				System.out.println("invalid input-------------------------");
				break;
		}


	}
}