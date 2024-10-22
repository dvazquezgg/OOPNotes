package library;

import java.util.*;

// Derived Class: Member
public class Member extends Person {
    private String memberID;
    private List<Book> borrowedBooks;

    public Member(String name, String email, String memberID) {
        super(name, email);
        this.memberID = memberID;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberID() {
        return memberID;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    @Override
    public String toString() {
        return "Member: " + super.toString() + " [ID: " + memberID + "]";
    }
}

