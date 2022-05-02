import java.util.Scanner;
class array{
    int m=2;
    int n=2;
    int arr[][]=new int[m][n];
    Scanner sc=new Scanner(System.in);
    void readArray(){
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("enter value of "+"["+i+"]"+"["+j+"] : ");
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void sum1(){
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=arr[i][0];
        }
        System.out.println("Sum Of First Raw = "+sum);
        /*try{
            Thread.sleep(1000);
        }catch(Exception e){
            
        }*/
    }
    void sum2(){
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=arr[i][1];
        }
        System.out.println("Sum Of Second Raw = "+sum);
        /*try{
            Thread.sleep(1000);
        }catch(Exception e){
            
        }*/
    }
}
class Thread1 extends Thread{
    array obj=new array();
    public void run(){
        obj.readArray();
        obj.sum1();
        obj.sum2();
    }
}
/*class Thread2 extends Thread{
    array obj=new array();
    public void run(){
        
    }
}
class Thread3 extends Thread{
    array obj=new array();
    public void run(){
        
    }
}*/
class arrayDemo{
    public static void main(String[] args){
        Thread1 t1=new Thread1();
        //Thread2 t2=new Thread2();
        //Thread3 t3=new Thread3();
        t1.start();
        //t2.start();
        //t3.start();
    }
}
/*
class sum1 extends Thread{
    array obj=new array();
    int sum=0;
    void s(){
        for(int i=0;i<m;i++){
            sum+=arr[i][0];
        }
        System.out.println("Sum Of First Raw = "+sum);
    }
}
class sum2 extends Thread{
    array obj=new array();
    int sum=0;
    void s(){
        for(int i=0;i<m;i++){
            sum+=arr[i][1];
        }
        System.out.println("Sum Of Second Raw = "+sum);
    }
}*/

