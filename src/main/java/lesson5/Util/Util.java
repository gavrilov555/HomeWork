package lesson5.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

    private static SessionFactory sessionFactory;

    private static void buildSessionFactory() {

        try {
            Configuration config = new Configuration();
            config.configure();
            sessionFactory = config.buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory(){

        if (sessionFactory == null) buildSessionFactory();
        return sessionFactory;
    }

    public static void shutdown(){
        getSessionFactory().close();
    }
}
