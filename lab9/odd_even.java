class Thread1 extends Thread{
    public Thread1(){
        start();
    }
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.println("Odd Number : "+i);
            }
        }
    }
}
class Thread2 extends Thread{
    public Thread2(){
        start();
    }
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println("Even Number : "+i);
            }
        }
    }
}
public class odd_even{
    public static void main(String[] args){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
    }
}