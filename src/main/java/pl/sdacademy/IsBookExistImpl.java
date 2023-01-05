package pl.sdacademy;

import javax.persistence.EntityManager;

public class IsBookExistImpl implements IsBookExist {
    private static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    @Override
    public boolean isBookExist(String isbn) {
        em.getTransaction ().begin ();
    Book result = em.createQuery("select * from book whare isbn_number = :isbn", Book.class)
            .setParameter("isbn", isbn)
            .getSingleResult();

    em.getTransaction ().commit ();
    return result != null;

    }
}
