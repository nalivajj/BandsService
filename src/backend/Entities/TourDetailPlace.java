package backend.Entities;

import javax.persistence.*;

@Entity
@Table(name = "tour_detail_place")
public class TourDetailPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String country;

    @Column
    private String city;

    @Column
    private String place;
}
