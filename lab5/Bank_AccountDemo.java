import java.util.Scanner;

class Bank_Account{
	int actno;
	String username;
	String email;
	String actType;
	int actBalance;
	Scanner sc=new Scanner(System.in);

	void getAccountDetails(){
		System.out.print("Enter actno:");
		actno =sc.nextInt();
		System.out.print("Enter username:");
		username=sc.next();
		System.out.print("Enter email:");
		email=sc.next();
		System.out.print("Enter actType:");
		actType=sc.next();
		System.out.print("Enter actBalance:");
		actBalance=sc.nextInt();
	}
	void displayAccountDetails(){
		System.out.println("Account Details------------");
		System.out.println("Enter actno:"+actno);
		System.out.println("Enter username:"+username);
		System.out.println("Enter email:"+email);
		System.out.println("Enter actType:"+actType);
		System.out.println("Enter actBalance:"+actBalance);
		
	}
}
class Bank_AccountDemo{
	public static void main(String[] args){
		Bank_Account cn=new Bank_Account();

		cn.getAccountDetails();
		cn.displayAccountDetails();
	}
}