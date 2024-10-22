package library;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private ArrayList<OldMember> members;

    public Library(){
        this.bookCollection = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public Library(ArrayList<Book> bookCollection, ArrayList<OldMember> members) {
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
    public void registerMember(OldMember member){
        this.members.add(member);
    }
}
