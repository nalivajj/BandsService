package backend;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import backend.Entities.*;
public class TestHibernate {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("backend/resources/hibernate.cfg.xml")
                .addAnnotatedClass(Band.class)
                .addAnnotatedClass(Concert.class)
                .addAnnotatedClass(MessageAboutTour.class)
                .addAnnotatedClass(Photo.class)
                .addAnnotatedClass(TopList.class)
                .addAnnotatedClass(Tour.class)
                .addAnnotatedClass(TourDetailPlace.class)
                .addAnnotatedClass(Users.class)
                .buildSessionFactory();
        sessionFactory.close();
    }
}
