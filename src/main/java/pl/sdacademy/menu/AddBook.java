package pl.sdacademy.menu;

import pl.sdacademy.Book;
import pl.sdacademy.BookRegistration;
import pl.sdacademy.HibernateUtil;
import pl.sdacademy.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.persistence.EntityManager;

public class AddBook {
    private static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    private static String registrationNumber;
    private static String title;
    private static String author;
    private static String publisher;
    private static String isbnNumber;


    public static void addBook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Prosze podac numer identyfikacyjny");
        registrationNumber = scan.nextLine();
        System.out.println("Prosze podac tytul ksiazki");
        title = scan.nextLine();
        System.out.println("Prosze podac autora ksiazki");
        author = scan.nextLine();
        System.out.println("Prosze podac wydawce ksiazki");
        publisher = scan.nextLine();
        System.out.println("Prosze podac numer ISBN ksiazki");
        isbnNumber = scan.nextLine();
        System.out.println("Czy chcesz dodac nastepujaca ksiazke?(t/n)");
        System.out.println(registrationNumber + " " + title + " " + author + " " + publisher + " " + isbnNumber);

        answer();
    }
    private static void answer() {
        try {
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            switch (answer) {
                case "t":
                    System.out.println("Ksiazka zostala dodana");
                    initData();
                    Menu.mainMenu();
                    break;
                case "n":
                    addBook();
                    break;
                default:
                    System.out.println("Prosze wybrac poprawna wartosc!");
                    answer();
            }
        } catch (InputMismatchException e) {
            System.out.println("Prosze wybrac poprawna wartosc!");
            answer();
        }
    }

    private static void initData() {
    em.getTransaction ().begin ();
    Book b1 = new Book (title, isbnNumber, publisher, author);
    BookRegistration br1 = new BookRegistration(registrationNumber);
    b1.addBookRegistration(br1);

    em.persist (b1);
    em.getTransaction ().commit ();
  }
}