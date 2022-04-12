import java.util.Scanner;
class student{
	int id_no;
	int no_of_subjects;
	String subject_code[]= new String[10];
	double subject_credits[]= new double[10];
	String grade_obtained[]= new String[10];
	double total[]= new double[10];
	double tl=0;
	double crd=0;
	double spi=0;

	Scanner sc=new Scanner(System.in);

	
		void getDetailOfStudent(){
			System.out.print("Enter id_no:");
			id_no =sc.nextInt();
			System.out.print("Enter Number Of Subject : ");
			no_of_subjects=sc.nextInt();

			for(int i=0;i<no_of_subjects;i++){
				System.out.print("Enter"+(i+1)+"Subject Code : ");
				subject_code[i]=sc.next();
				System.out.print("Enter"+(i+1)+"Subject Credit : ");
				subject_credits[i]=sc.nextDouble();
				System.out.print("Enter"+(i+1)+"Subject's Grad : ");
				grade_obtained[i]=sc.next();
			}

			
		}
		void displayStudent(){
			
			System.out.println("id no = "+id_no);
			int n=no_of_subjects;
			for(int i=0;i<n;i++){
				System.out.println("subject code = "+subject_code[i]);
				System.out.println("");
				System.out.println("subject credit = "+subject_credits[i]);
				System.out.println("");
				System.out.println("grade obtained = "+grade_obtained[i]);
				System.out.println("");
			}
			
		}
		void spi(){
			int n=no_of_subjects;
			for(int i=0;i<n;i++){
				if(grade_obtained[i].equalsIgnoreCase("aa"))
				{
					total[i]=10*subject_credits[i];
				}
				else if(grade_obtained[i].equalsIgnoreCase("a"))
				{
					total[i]=9*subject_credits[i];
				}
				else if(grade_obtained[i].equalsIgnoreCase("bb"))
				{
					total[i]=8*subject_credits[i];
				}
				else if(grade_obtained[i].equalsIgnoreCase("b"))
				{
					total[i]=7*subject_credits[i];
				}
				else if(grade_obtained[i].equalsIgnoreCase("cc"))
				{
					total[i]=6*subject_credits[i];
				}
				else if(grade_obtained[i].equalsIgnoreCase("c"))
				{
					total[i]=5*subject_credits[i];
				}
				else if(grade_obtained[i].equalsIgnoreCase("dd"))
				{
					total[i]=4*subject_credits[i];
				}
				else if(grade_obtained[i].equalsIgnoreCase("d"))
				{
					total[i]=3*subject_credits[i];
				}
				else if(grade_obtained[i].equalsIgnoreCase("bb"))
				{
					total[i]=8*subject_credits[i];
				}
				else
				{
					total[i]=2*subject_credits[i];
				}
			}
			for(int i=0;i<n;i++)
			{
				tl+=total[i];
				crd+=subject_credits[i];
			}
			spi=tl/crd;
			System.out.println("Your Spi = "+spi);

		}
		
}
class studentDemo{
	public static void main(String[] args){
		double a;
		a=Double.parseDouble(args[0]);
		student s=new student();
		for(int j=0;j<a;j++){
			System.out.println("Enter Details Of "+(j+1)+" Student---------------------");
			s.getDetailOfStudent();
		}
		s.spi();
		/*for(int k=0;k<a;k++){
			System.out.println("Details Of "+(k+1)+" Student---------------------");
			s.displayStudent();
		}*/
		
	}
}