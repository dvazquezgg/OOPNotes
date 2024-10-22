package old;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean availability;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = false;
    }

    public Book(String title, String author, String ISBN, boolean availability) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = availability;
    }

    public void checkout(){
        if (this.availability == true){
            this.availability = false;
        }
    }

    public void returnBook(){
        this.availability = true;
    }
}
