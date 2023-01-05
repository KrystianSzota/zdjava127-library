package pl.sdacademy;

import javax.persistence.*;

@Entity
public class BookRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_record_id")
    private int bookRecordId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "registration_number")
    private String registrationNumber;

    public BookRegistration(){
    }

    public int getBookRecordId() {
        return bookRecordId;
    }

    public void setBookRecordId(int bookRecordId) {
        this.bookRecordId = bookRecordId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public BookRegistration(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
