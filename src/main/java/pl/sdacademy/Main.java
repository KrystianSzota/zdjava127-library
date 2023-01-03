package pl.sdacademy;

import javax.persistence.EntityManager;

/**
 * @author jjankowski
 */

public class Main {
  private static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
  public static void main(String[] args) {
    initData();

    HibernateUtil.shutdown();
  }

  private static void initData() {
    em.getTransaction ().begin ();
    Book b1 = new Book ("lkdshaglkhsadglksdg", "1234567890123", "ijregsdhglhdskd", "jlksdahgk;jadsg");
    BookRegistration br1 = new BookRegistration (1, "PLasjgfkjsgskj");

    em.persist (b1);
    em.persist (br1);
    em.getTransaction ().commit ();
  }
}
