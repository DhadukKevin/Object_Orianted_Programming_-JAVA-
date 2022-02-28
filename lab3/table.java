import java.util.Scanner;
public class table{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);

		System.out.print("Enter N:");
		int n=s.nextInt();

		for(int i=1;i<=10;i++)
		{
			System.out.print(n+" * "+i+" = ");
			System.out.println(n*i);
		}
	} 
}