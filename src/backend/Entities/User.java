package backend.Entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column
    private String password;

    @Column
    private String email;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @ManyToMany(mappedBy = "subscribedUsers")
    private List<Band> bandsSubscriptions;

    @OneToMany(mappedBy = "user")
    private List<UserPhoto> userPhotos;

    @OneToMany(mappedBy = "user")
    private List<MessageAboutTour> messagesAboutTour;

    @OneToMany(mappedBy = "user")
    private List<BandRating> bandRatings;

    @OneToMany(mappedBy = "user")
    private List<PerformanceRating> performanceRatings;

    @OneToMany(mappedBy = "user")
    private List<TourRating> tourRatings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Band> getBandsSubscriptions() {
        return bandsSubscriptions;
    }

    public void setBandsSubscriptions(List<Band> bandsSubscriptions) {
        this.bandsSubscriptions = bandsSubscriptions;
    }

    public List<UserPhoto> getUserPhotos() {
        return userPhotos;
    }

    public void setUserPhotos(List<UserPhoto> userPhotos) {
        this.userPhotos = userPhotos;
    }

    public List<MessageAboutTour> getMessagesAboutTour() {
        return messagesAboutTour;
    }

    public void setMessagesAboutTour(List<MessageAboutTour> messagesAboutTour) {
        this.messagesAboutTour = messagesAboutTour;
    }

    public List<BandRating> getBandRatings() {
        return bandRatings;
    }

    public void setBandRatings(List<BandRating> bandRatings) {
        this.bandRatings = bandRatings;
    }

    public List<PerformanceRating> getPerformanceRatings() {
        return performanceRatings;
    }

    public void setPerformanceRatings(List<PerformanceRating> performanceRatings) {
        this.performanceRatings = performanceRatings;
    }

    public List<TourRating> getTourRatings() {
        return tourRatings;
    }

    public void setTourRatings(List<TourRating> tourRatings) {
        this.tourRatings = tourRatings;
    }
}
