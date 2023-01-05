package pl.sdacademy;

import javax.persistence.EntityManager;

import static java.sql.DriverManager.println;


public class RepositoryImp implements Repository {
    private static EntityManager em = HibernateUtil.getSessionFactory ().createEntityManager ();

    @Override
    public boolean isExist(BookRegistration registrationNumber) {
        em.getTransaction ().begin ();
        BookRegistration result = em.createQuery ("select * from bookregistration where registration_number =  :registrationNumber", pl.sdacademy.BookRegistration.class)
                .setParameter ("registrationNumber", registrationNumber)
                .getSingleResult ();

        if (result != null) {
            println ("Książka o numerze rejestru:" + registrationNumber + "jest już zarejestrowana");
        } else {
            println ("Książka o numerze rejestru:" + registrationNumber + "nie jest jeszcze zarejestrowana");
        }
        em.getTransaction ().commit ();
        return result != null;
    }


//    @Override
//    public boolean isExist(List<> t) {
//        return false;
}


