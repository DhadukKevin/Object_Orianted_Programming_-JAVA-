class main{
    void gm(){
        while(true){
            System.out.println("good morning");
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }
    void ga(){
        while(true){
            System.out.println("good afternoon");
            try{
                Thread.sleep(3000);
            }catch(Exception e){
                
            }
        }
    }
}
class GoodMorning extends Thread{
    main obj= new main();
    public void run(){
        try{
            obj.gm();
        }catch(Exception e){

        }
    }
}
class GoodAfternoon extends Thread{
    main obj= new main();
    public void run(){
        try{
            obj.ga();
        }catch(Exception e){
            
        }
    }
}
class gm_ga{
    public static void main(String[] args){
        GoodAfternoon obj1=new GoodAfternoon();
        GoodMorning obj2=new GoodMorning();
        obj1.start();
        obj2.start();
    }
}