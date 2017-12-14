package backend;

import backend.Entities.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("resources/hibernate.cfg.xml")
                .addAnnotatedClass(Band.class)
                .addAnnotatedClass(BandPhoto.class)
                .addAnnotatedClass(BandRating.class)
                .addAnnotatedClass(MessageAboutTour.class)
                .addAnnotatedClass(Performance.class)
                .addAnnotatedClass(PerformanceRating.class)
                .addAnnotatedClass(Rating.class)
                .addAnnotatedClass(Tour.class)
                .addAnnotatedClass(TourDetailPlace.class)
                .addAnnotatedClass(TourRating.class)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(UserPhoto.class)
                .buildSessionFactory();
        sessionFactory.close();
    }
}
