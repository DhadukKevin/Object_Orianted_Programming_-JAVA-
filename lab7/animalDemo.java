interface transport{
    void deliver();
}
abstract class animal{
    abstract void display();
}
class tiger extends animal{
    void display(){
        System.out.println("tiger class");
    }
}
class deer extends animal{
    void display(){
        System.out.println("deer class");
    }
}
class camel extends animal implements transport{
    void display(){
        System.out.println("camel class");
    }
    public void deliver(){
        System.out.println("camel deliver");
    }
}
class donkey extends animal implements transport{
    void display(){
        System.out.println("donkey class");
    }
    public void deliver(){
        System.out.println("donkey deliver");
    }
}
class animalDemo{
    public static void main(String[] args){
        tiger t=new tiger();
        t.display();
        deer d=new deer();
        d.display();
        camel c=new camel();
        c.display();
        c.deliver();
        donkey d1=new donkey();
        d1.display();
        d1.deliver();
    }
}