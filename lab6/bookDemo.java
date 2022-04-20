class book{
    private String author_name;
    book(String author_name){
        this.author_name=author_name;
    }
    void display(){
        System.out.println("name of author : "+author_name);
    }
}
class book_Publication extends book{
    private String title;
    book_Publication(String title){
        super("");
        this.title=title;

    }
        void display(){
        System.out.println("book title : "+title);
    }
}
class paper_Publication extends book{
    private String title;
    paper_Publication(String title){
        super("");
        this.title=title;
    }
    

    void display(){
        System.out.println("paper title : "+title);
    }
}
class bookDemo{
    public static void main(String[] args){
        book b1=new book("chetan bhagat");
        b1.display();
/*book_Publication b2=new book_Publication();
        b2.display();
        paper_Publication p1=new paper_Publication();
        p1.display();*/

        System.out.println("-----------by dynamic method dispatch-------------");
        book b3=new book_Publication("2 states");
        b3.display();
        book b4=new paper_Publication("paper");
        b4.display();
    }
}