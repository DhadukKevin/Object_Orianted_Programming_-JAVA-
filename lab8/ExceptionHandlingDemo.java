class MyException extends Exception{
	String str;
	public MyException(String str)
	{
		this.str=str;
	}
	public void display()
	{
		System.out.println(this.str);
	}
}
public class ExceptionHandlingDemo
{
	public static void main(String[] args)
	{
		int sum=0,flag=0;
		String str;
		for(int i=0;i<args.length;i++)
		{
			int n=Integer.parseInt(args[i]);
			flag=0;
			str="";
			try
			{
				if(n<0)
				{
					str=str+" Number is Negative";
					flag=1;
				}
				if(n%10==0)
				{
					str=str+" Number is Divisible by 10";
					flag=1;
				}
				if(n>1000 && n<2000)
				{
					str=str+" Number is Lesser than 2000 and greter than 1000";
					flag=1;
				}
				if(n>7000)
				{
					str=str+" Number is Greater than 7000";
					flag=1;
				}
				if(flag==1)
				{
					throw new MyException(str);
				}
				else
				{
					sum=sum+n;
				}
			}
			catch(MyException e)
			{
				System.out.println("Exception are catched for number "+n);
				e.display();
			}
		}
		System.out.println("Sum= "+sum);
	}
}