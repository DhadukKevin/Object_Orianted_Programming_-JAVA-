class member{
    String Name;
    int Age;
    String Phoneno;
    String Address;
    double Salary;

    void salary(){
        System.out.println("Salary = "+Salary);
    }

}
class employee extends member{

    String specialization;
    
    employee(String Name,int Age,String Phoneno,String Address,double Salary,String specialization){
        this.Name=Name;
        this.Age=Age;
        this.Phoneno=Phoneno;
        this.Address=Address;
        this.Salary=Salary;
        this.specialization=specialization;
    }

    void diasplayEmployeeDetails(){
        System.out.println("Details Of Employee===========");
        System.out.println("Name = "+Name);
        System.out.println("Age = "+Age);
        System.out.println("Phoneno = "+Phoneno);
        System.out.println("Address = "+Address);
        salary();
        System.out.println("specialization = "+specialization);
        System.out.println();
    }

}

class manager extends member{

    String department;
    
    manager(String Name,int Age,String Phoneno,String Address,double Salary,String department){
        this.Name=Name;
        this.Age=Age;
        this.Phoneno=Phoneno;
        this.Address=Address;
        this.Salary=Salary;
        this.department=department;
    }

    void diasplayManagerDetails(){
        System.out.println("Details Of Manager===========");
        System.out.println("Name = "+Name);
        System.out.println("Age = "+Age);
        System.out.println("Phoneno = "+Phoneno);
        System.out.println("Address = "+Address);
        salary();
        System.out.println("department = "+department);
        System.out.println();
    }

}

class memberDemo{
    public static void main(String[] args){
        employee sc=new employee("kevin",18,"9173389839","rjkot",60000,"data scintist");
        manager s=new manager("rushi",17,"1234567890","ahmedabad",90000,"hr");

        sc.diasplayEmployeeDetails();
        s.diasplayManagerDetails();

    }
}