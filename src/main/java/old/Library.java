package old;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private ArrayList<Member> members;

    public Library(){
        this.bookCollection = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public Library(ArrayList<Book> bookCollection, ArrayList<Member> members) {
        this.bookCollection = bookCollection;
        this.members = members;
    }

    public void addBook(Book newBook){
        this.bookCollection.add(newBook);
    }

    public Book removeBook(Book droppedBook){
        Book foundBook = searchBook(droppedBook);
        if(foundBook != null){
            this.bookCollection.remove(foundBook);
        }
        return foundBook;
    }

    public Book searchBook(Book book){
        for(Book currentBook: this.bookCollection){
            if(currentBook.equals(book)){
                return currentBook;
            }
        }
        return null;
    }
    public void registerMember(Member member){
        this.members.add(member);
    }
}
