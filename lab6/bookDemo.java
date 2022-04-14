class book{
    String author_name="chetan bhagat";
    void display(){
        System.out.println("name of author : "+author_name);
    }
}
class book_Publication extends book{
    String book_title="2states";
    void display(){
        System.out.println("book title : "+book_title);
    }
}
class paper_Publication extends book{
    String paper_title="paper";
    void display(){
        System.out.println("paper title : "+paper_title);
    }
}
class bookDemo{
    public static void main(String[] args){
        book b1=new book();
        b1.display();
        book_Publication b2=new book_Publication();
        b2.display();
        paper_Publication p1=new paper_Publication();
        p1.display();

        System.out.println("-----------by dynamic method dispatch-------------");
        book b3=new book_Publication();
        b3.display();
        book b4=new paper_Publication();
        b4.display();
    }
}

