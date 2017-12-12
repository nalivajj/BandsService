package backend.Entities;

import javax.persistence.*;

@Entity
@Table(name = "message_about_tour")
public class MessageAboutTour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String text;

    @Column(name = "is_tour_or_place_tour")
    private boolean isTourOrPlaceTour;

}
