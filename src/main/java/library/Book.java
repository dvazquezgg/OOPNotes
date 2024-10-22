package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Composition: Book Class
public class Book {
    private String title;
    private List<Author> authors;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.isAvailable = true;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book: " + title + ", Authors: " + authors;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.title);
    }
}

