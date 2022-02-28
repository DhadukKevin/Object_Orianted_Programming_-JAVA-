import java.util.*;
public class arrsum{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);

		double a[]= new double[4];
		double sum=0;
		double avg;
		

		for(int i=0; i<4; i++)
		{
			
			
				System.out.println("Enter "+i+" value:");
				a[i]=s.nextInt();
			
		}
		for(int j=0;j<4;j++)
		{
			sum+=a[j];
		}
		System.out.print(sum);
		avg=sum/4;

		System.out.print("Average Of Arr Character="+avg);
	}
}