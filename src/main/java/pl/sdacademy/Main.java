package pl.sdacademy;

import javax.persistence.EntityManager;


/**
 * @author jjankowski
 */

public class Main {
  private static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
  public static void main(String[] args) {
    Menu.mainMenu();

//    initData();

//    HibernateUtil.shutdown();
  }

//  private static void initData() {
//    em.getTransaction ().begin ();
//    Book b1 = new Book ("lkdshaglkhsadglksdg", "1234567890123", "ijregsdhglhdskd", "jlksdahgk;jadsg");
//    BookRegistration br1 = new BookRegistration (1, "PLasjgfkjsgskj");
//
//    em.persist (b1);
//    em.persist (br1);
//    em.getTransaction ().commit ();
//  }

//  private static void removeBook() {
//    System.out.println("test usuniecia ksiazki");
//    menu();
//  }
//
//  private static void addUser() {
//    System.out.println("test dodania uzytkownika");
//    menu();
//  }
//
//  private static void removeUser() {
//    System.out.println("test usuniecia uzytkownika");
//    menu();
//  }
//
//  private static void rentBook() {
//    System.out.println("test wypozyczenia ksiazki");
//    menu();
//  }
//
//  private static void returnBook() {
//    System.out.println("test zwrotu ksiazki");
//    menu();
//  }



}


