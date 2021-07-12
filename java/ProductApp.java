import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ProductApp {
    private static SessionFactory sessionFactory;

    public static void init() {
        ProductDao.forcePrepareData();
        sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();     }
}
