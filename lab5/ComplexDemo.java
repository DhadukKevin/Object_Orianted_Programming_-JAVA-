import java.util.Scanner;
class Complex{
    int real;
    int imagenary;
    Scanner sc=new Scanner(System.in);
    void getDetails(){
        System.out.print("Enter Real Part:");
        real=sc.nextInt();
        System.out.print("Enterimagenary Part:");
        imagenary=sc.nextInt();
    }

    Complex addComplex(Complex c2){
        Complex c3=new Complex();
        c3.real=real+c2.real;
        c3.imagenary=imagenary+c2.imagenary;

        return c3;
    }
     void display(){
        System.out.println(real+" + "+"i"+imagenary);
        System.out.println(real+" - "+"i"+imagenary);
    }
} 
class ComplexDemo{
    public static void main(String[] args){
        Complex c1=new Complex();
        Complex c2=new Complex();
        Complex c3;

        c1.getDetails();
        c2.getDetails();
        c3=c1.addComplex(c2);
        c3.display();
    }
}