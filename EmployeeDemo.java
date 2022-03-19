import java.util.Scanner;
class Employee{
    String Employee_Id;
    String Employee_Name;
    String Designation;
    int age;
    int salary;
    Scanner sc=new Scanner(System.in);

    void getEmployeeDetails(){

        System.out.print("Enter Id:");
        Employee_Id=sc.next();
        System.out.print("Enter Name:");
        Employee_Name=sc.next();
        System.out.print("Enter Designation:");
        Designation=sc.next();
        System.out.print("Enter Age:");
        age=sc.nextInt();
        System.out.print("Enter Salary:");
        salary=sc.nextInt();

    }
    void displayEmployeeDetails(){
        System.out.println("");
        System.out.println("=================================");
        System.out.println("");
        System.out.println("Employee Details-----------------");
        System.out.println("");
        System.out.println("Employee_Id= "+Employee_Id);
        System.out.println("Employee_Name= "+Employee_Name);
        System.out.println("Designation= "+Designation);
        System.out.println("Age= "+age);
        System.out.println("Salary= "+ salary);
        System.out.println("");
        System.out.println("=================================");
    }
}
class EmployeeDemo{
    public static void main(String[] args){
        Employee sc=new Employee();

        sc.getEmployeeDetails();
        sc.displayEmployeeDetails();
    }
}
