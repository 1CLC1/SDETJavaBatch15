package class19;

public class Book {
    String author;
    String title;
    int year;

    Book(String author,String title){
        this.author=author;
        this.title=title;
    }
    Book(String author,String title,int year){
        this(author,title);
        this.year=year;
    }
    void info(){
        System.out.println("Author:"+author+", Title: "+title+", published: "+year);
    }
}
