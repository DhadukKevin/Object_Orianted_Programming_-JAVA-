abstract class vegetable{
    String color;
    vegetable(String color){
        this.color=color;
    }
}
class potato extends vegetable{
    super("creame");
    void display(){
        System.out.println("potato = "+color);
    }
}
class Brinjal extends  vegetable{
    super("purple");
    void display(){
        System.out.println("Brinjal = "+color);
    }
}
class Tomato extends  vegetable{
    super("Red");
    void display(){
        System.out.println("Tomato = "+color);
    }
}
class vegetableDemo{
    public static void main(String[] args){
        potato p=new potato();
        Brinjal b=new Brinjal();
        Tomato t=new Tomato();
        p.display();
        b.display();
        t.display();
    }
}