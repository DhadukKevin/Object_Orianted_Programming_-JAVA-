import java.util.Scanner;
public class prime{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter N:");
		int n=s.nextInt();
		int a=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				a=1;
				break;
			}
			
		}
		if(a==1)
		{
			System.out.print(n+" "+"Is Not A  Prime Number");
		}
		else
		{
			System.out.print(n+" "+"Is Prime Number");
		}

	}
}