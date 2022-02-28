import java.util.*;
public class strvovel{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("enter string:");
		String s1=s.next();
		int vovel=0;
		int conso=0;
		int l=s1.length();
		String s2=s1.toLowerCase();

		for(int i=0;i<l;i++)
		{
			char ch=s2.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vovel++;
			}
			else
			{
				conso++;
			}
		}
		System.out.println("vovels="+vovel+" "+"consonant="+conso);
	}
}