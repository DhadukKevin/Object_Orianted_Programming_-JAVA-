public class cmdcap{
	public static void main(String[] args){

		String a=args[0];
		int l=args[0].length();
		char b=args[0].charAt(0);
		boolean flag=true;
		for(int i=0;i<l;i++)
		{
			
			if (Character.isUpperCase(b))
			{
				flag=false;	
			}
			
			
		}
		if(flag==false)
		{
			System.out.print("teminated");
		}
		else
		{
			System.out.print(args[0]);
		}
		
	}
}