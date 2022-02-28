import java.util.*;
public class revarry{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);

		int a[]= new int[4];
		
			for(int i=0; i<4; i++)
			{
				System.out.println("Enter "+i+" value:");
				a[i]=s.nextInt();
			}
		System.out.println("=========================");
			for(int j=3;j>=0;j--)
			{
				int b;
				b=a[j];
				System.out.println(b);
			}
		}		
}