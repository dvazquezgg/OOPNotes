
import library.Library;
import library.Author;
import library.Book;
import library.Member;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create a Library
        Library library = new Library("City Library");

        // Create Authors
        Author author1 = new Author("J.K. Rowling", "jkrowling@example.com");
        Author author2 = new Author("George Orwell", "gorwell@example.com");

        // Create Books
        Book book1 = new Book("Harry Potter");
        book1.addAuthor(author1);

        Book book2 = new Book("1984");
        book2.addAuthor(author2);

        Book book3 = new Book("Animal Farm");
        book3.addAuthor(author2);

        // Add Books to the Library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create Members
        Member member1 = new Member("Alice", "alice@example.com", "M001");
        Member member2 = new Member("Bob", "bob@example.com", "M002");

        // Add Members to the Library
        library.addMember(member1);
        library.addMember(member2);

        // Display Library Information
        System.out.println(library);

        // Member borrows a book
        member1.borrowBook(book1);
        book1.setAvailable(false);
        System.out.println(member1 + " borrowed " + book1.getTitle());

        // Search for a book by title
        Book foundBook = library.searchBookByTitle("1984");
        System.out.println("Search Result: " + (foundBook != null ? foundBook : "Book not found"));

        // Sort Books by Title
        System.out.println("Sorting books by title:");
        library.sortBooksByTitle();
        System.out.println(library);

        // Sort Books by Author
        System.out.println("Sorting books by author:");
        library.sortBooksByAuthor();
        System.out.println(library);
    }
}
