package old;

public class Member {

    private String name;
    private int ID;
    private Book[] borrowedBooks;
    private int bookCount;
    private static final int MAX_BOOKS = 5;

    public Member(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.borrowedBooks = new Book[MAX_BOOKS];
        this.bookCount = 0;
    }

    public void borrowBook(Book bookToBorrow){
        if(bookCount < MAX_BOOKS){
            this.borrowedBooks[bookCount] = bookToBorrow;
            bookCount ++;
        }
    }

    public void returnBook(Book returningBook){
        int bookIndex = -1;
        for(int index = 0; index < MAX_BOOKS; index++){
            if (this.borrowedBooks[index].equals(returningBook)) {
                bookIndex= index;
                break;
            }
        }
        if(bookIndex >= 0){
            for(int pos = bookIndex; pos< MAX_BOOKS - 1; pos++){
                this.borrowedBooks[pos] = this.borrowedBooks[pos + 1];
            }
            this.borrowedBooks[MAX_BOOKS -1] = null;
        }
    }
}
