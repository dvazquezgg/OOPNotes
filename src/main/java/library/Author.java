package library;

// Derived Class: Author
public class Author extends Person {
    public Author(String name, String email) {
        super(name, email);
    }

    @Override
    public String toString() {
        return "Author: " + super.toString();
    }
}
