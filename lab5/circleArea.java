import java.util.Scanner;
class circleArea{
	public static void main(String[] args){


		Scanner s=new Scanner(System.in);

		circleArea area=new circleArea();
		System.out.print("Enter radius:");
		double r=s.nextDouble();
		double ca=area.cArea(r);

		System.out.println("Area Of "+r+" Radius Circle = "+ca);
	}
	


	double cArea(double radius){
		double pai=3.14;
		double area=(pai)*(radius*radius);
		return area;
	}
}