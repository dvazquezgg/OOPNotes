package library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Aggregation: Library Class
public class Library {
    private String name;
    private List<Book> books;
    private List<Member> members;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    // Search for a book by title
    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Sort books by title
    public void sortBooksByTitle() {
        books.sort(Comparator.comparing(Book::getTitle));
    }

    // Sort books by author's name
    public void sortBooksByAuthor() {
        books.sort(Comparator.comparing(b -> b.getAuthors().get(0).getName()));
    }

    @Override
    public String toString() {
        return "Library: " + name + ", Books: " + books + ", Members: " + members;
    }
}
