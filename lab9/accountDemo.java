import java.util.Scanner;
class account extends Exception{
	String str;
	public account(String str)
	{
		this.str=str;
	}
	public void display()
	{
		System.out.println(this.str);
	}
}
public class accountDemo
{
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
		int sum=0,flag=0;
		String str;
		int n=Integer.parseInt(args[0]);
		str="";
		do{
			System.out.print("Enter Withdraw Amount : ");
			int amt=sc.nextInt();
			n=n-amt;
			try
			{
				if(n<5000){
					flag=1;
				}	
				if(flag==1){
					throw new account(str);
				}
				if(flag==1){
				n=n+amt;
				System.out.println("amount= "+n);
			}
			else
			{
				System.out.println("amount= "+n);
			}
			}
			catch(account e)
			{
				System.out.println("insufficient balance for amount "+amt);
				e.display();
			}
			
		}while(n>5000);
	}
}