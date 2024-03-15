package nikhil.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Book{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String title;
    private String isbn;

    @ManyToMany
    @JoinTable(name = "author book", joinColumns = @JoinColumn(name = "book id"),
    inverseJoinColumns = @JoinColumn(name="author id"))
    private Set<Author> Authors;

    public Set<Author> getAuthors() {
        return Authors;
    }

    public void setAuthors(Set<Author> authors) {
        Authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
