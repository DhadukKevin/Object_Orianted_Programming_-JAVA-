import java.util.*;
public class displaystr{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);

		System.out.print("Enter String:");
		String s1=s.next();
		int l=s1.length();

		for(int i=0;i<l;i++)
		{
			for(int k=0;k<l-i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				char ch=s1.charAt(j);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}