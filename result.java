import java.util.*;
public class result{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.print("Phy Marks:");
		float phy=s.nextFloat();

		System.out.print("Sci Marks:");
		float sci=s.nextFloat();

		System.out.print("Math Marks:");
		float math=s.nextFloat();

		System.out.print("Com Marks:");
		float com=s.nextFloat();

		
		System.out.print("eng Marks:");
		float eng=s.nextFloat();

		float total;
		float avg;
		total=phy+sci+math+com+eng;
		avg=total/5;


				if(avg>=70.00)
		{
			System.out.print("Distriction");
		}
		else if(avg>=60.00)
		{
			System.out.print("First Class");
		}
		else if(avg>=50.00)
		{
			System.out.print("Second Class");
		}
		else if(avg>=40.00)
		{
			System.out.print("Pass Class");
		}
		else
		{
			System.out.print("Fail");
		}
		
	}
}