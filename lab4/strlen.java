import java.util.*;
public class strlen{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("enter string:");
		String s1=s.next();

		int l=s1.length();
		System.out.println("string length is:"+l);
		System.out.print("half string is:");
		for(int i=l/2;i<l;i++)
		{
			char ch=s1.charAt(i);
			System.out.print(ch);
		}
	}
}