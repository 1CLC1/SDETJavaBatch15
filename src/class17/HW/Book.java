package class17.HW;

public class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
    */
    String book;
    String author;
    int year;
    int page;

    Book(String bBook, String bAuthor, int bYear, int bPage) {
        book=bBook;
        author=bAuthor;
        year=bYear;
        page=bPage;
    }
    Book(String bBook,int bYear,int bPage,String bAuthor){
        book=bBook;
        author=bAuthor;
        year=bYear;
        page=bPage;
    }
    void print(){
        System.out.println("Name of book: "+book+" Author of book: "+author+" Year published: "+year+" Page number: "+page);
    }

}
