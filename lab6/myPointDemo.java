class myPoint{
    double x,y;
    public myPoint(){
        x=0;
        y=0;
    }
    public myPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double diastance(myPoint mp){
        double d=Math.sqrt(Math.pow(this.x-mp.x,2)+Math.pow(this.y-mp.y,2));
        return d;
    }
    public double diastance(double x,double y){
        double d=Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
        return d;
    }
    
}
class threePoint extends myPoint{
    double z;

    public threePoint(){
        super(0,0);
        z=0;
    }
    public threePoint(double x,double y,double z){
        super(x,y);
        this.z=z;
    }
    public double diastance(threePoint tp){
        double d=Math.sqrt(Math.pow(this.x-tp.x,2)+Math.pow(this.y-tp.y,2)+Math.pow(this.z-tp.z,2));
        return d;
    }
    public double diastance(double x,double y,double z){
        double d=Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)+Math.pow(this.z-z,2));
        return d;
    }
}
class myPointDemo{
    public static void main(String[] args){
        myPoint mp1=new myPoint();
        myPoint mp2=new myPoint(1,1);
        threePoint tp1=new threePoint();
        threePoint tp2=new threePoint(1,1,1);

        System.out.println("three point distance from 0,0,0 = "+tp1.diastance(tp2));
        System.out.println("three distance from 1,1,1 = "+tp1.diastance(1,1,1));

        System.out.println("two distance from 0,0 = "+mp1.diastance(mp2));
        System.out.println("two distance from 1,2 = "+mp1.diastance(1,2));
    }
}