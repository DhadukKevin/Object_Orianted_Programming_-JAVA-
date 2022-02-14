import java.util.*;
class clc
{
    public static void main(String[] args)
    {
        System.out.println("Enter Numbers-------------------------");
        Scanner s=new Scanner(System.in);

        System.out.print("Enter N1:");
        int n1=s.nextInt();
        System.out.print("Enter N2:");
        int n2=s.nextInt();
        System.out.print("Enter op:");
        char op=s.next().charAt(0);

        switch (op)
        {
            case '+':
             System.out.print("Sum=");
             System.out.println(n1+n2);
             break;

            case '-':
             System.out.print("Sub=");
             System.out.println(n1-n2);
             break;

            case '*':
             System.out.print("Mul=");
             System.out.println(n1*n2);
             break;

            case '/':
             System.out.print("Div=");
             System.out.println(n1/n2);
             break;
            
            case '%':
             System.out.print("Mod=");
             System.out.println(n1%n2);
             break;

            default:
              System.out.println("invalid input---------------");
              break;
        }

    }
}