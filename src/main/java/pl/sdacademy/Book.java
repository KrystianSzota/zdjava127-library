package pl.sdacademy;
import javax.persistence.*;
import java.sql.*;
import java.math.BigDecimal;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name = "Book_title")
    private String title;

    @Column(name = "Isbn_number")
    private BigDecimal isbn;

    @Column(name = "Publisher")
    private String publisher;

    @Column(name = "Author")
    private String autor;

    public Book(int id, String title, BigDecimal isbn, String publisher, String autor) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getIsbn() {
        return isbn;
    }

    public void setIsbn(BigDecimal isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}


